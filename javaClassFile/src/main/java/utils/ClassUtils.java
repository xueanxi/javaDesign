package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by user on 4/2/18.
 */

public class ClassUtils {

    /**
     * 获得实现了这个接口的所有类
     * @param c
     * @return
     */
    public static ArrayList<Class> getAllClassbyInterface(Class c) throws IOException, ClassNotFoundException {
        ArrayList<Class> returnClassList = new ArrayList<Class>();
        if(!c.isInterface()) return null;// 如果传入的参数不是接口类，这返回
        String packageName = c.getPackage().getName();
        List<Class>  allClass = getClasses(packageName);
        //判断是否是同一个接口
        for(int i=0;i<allClass.size();i++){
            if(c.isAssignableFrom(allClass.get(i))){  //判断是不是一个接口
                if(!c.equals(allClass.get(i))){   //本身不加进去
                    returnClassList.add(allClass.get(i));
                }
            }
        }
        return returnClassList;
    }


    /**
     * 获得包名里面的所有类
     * @param packageName
     * @return
     */
    public static ArrayList<Class> getClasses(String packageName) throws IOException, ClassNotFoundException {
        ArrayList<Class> result = new ArrayList<>();

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources =  classLoader.getResources(path);

        List<File> dirs = new ArrayList<File>();
        while(resources.hasMoreElements()){
            URL url = resources.nextElement();
            dirs.add(new File(url.getFile()));
        }
        for(File dir:dirs){
            result.addAll(findClasses(dir,packageName));
        }
        return result;
    }


    public static ArrayList<Class> findClasses(File directory,String packageName) throws ClassNotFoundException {
        ArrayList<Class> classes = new ArrayList<Class>();
        if(!directory.exists())return classes;

        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." +file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName+'.'+file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
     }
}
