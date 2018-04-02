package templateMethod;


import java.io.IOException;
import java.util.concurrent.ExecutorService;

/**
 * 模板方法 设计模式
 *
 * Car 就是一个模板类，run就是模板方法,setAlarm是钩子方法，其他是基本方法
 *
 *
 */
public class MainClass {


    public static void main (String[] arg) throws IOException, ClassNotFoundException {
        BaomaCar baoma = new BaomaCar();
        baoma.run();


        BaomaCar baoma2 = new BaomaCar();
        baoma2.setAlarm(false);
        baoma2.run();





    }
}
