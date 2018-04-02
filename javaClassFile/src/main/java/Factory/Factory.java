package Factory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import utils.ClassUtils;

/**
 * 工厂类，用于生产产品
 */

public class Factory {

    private static final String mFactoryName = "迪士尼工厂";

    private static HashMap<String, IFunction> mFunctionMap = new HashMap<String, IFunction>();

    /**
     * 根据传入的类，来生产出对应的对象
     * @param c
     * @return
     */
    public static IFunction createProduct(Class c){
        IFunction product = null;
        // 使用mFunctionMap可以减少实例化对象需要的时间
        try {
            if(mFunctionMap != null && mFunctionMap.containsKey(c.getSimpleName())){
                product =  mFunctionMap.get(c.getSimpleName());
            }else{
                product = (IFunction) Class.forName(c.getName()).newInstance();
                mFunctionMap.put(c.getSimpleName(),product);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }


    /**
     * 传入一个接口，然后返回实现了这个接口的所有类中，随机的其中一个类的对象
     * @param c
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static IFunction createProductWithInterface(Class c) throws IOException, ClassNotFoundException {
        IFunction product = null;
        ArrayList<Class> classes =  ClassUtils.getAllClassbyInterface(c);
        int index = new Random().nextInt(classes.size());
        try {
            product = (IFunction) Class.forName(classes.get(index).getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
