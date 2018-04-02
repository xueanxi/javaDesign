package Facade;


import java.io.IOException;
import java.util.concurrent.ExecutorService;

/**
 * Facade mode 面门设计模式
 * 简单讲，就是把复杂的内部过程封装起来，提供一个方法给外部调用，外部不用管里面的复杂实现。
 *
 *
 * 这个和工厂模式差不多
 *
 */
public class MainClass {

    private static ExecutorService mExecutor;
    public static void main (String[] arg) throws IOException, ClassNotFoundException {
        // 1.未使用门面模式时，干一件事情很麻烦，需要每个步骤都调用一次
        WorkA worka = new WorkA();
        worka.step1(2.2f);
        worka.step2(3);
        worka.step3();
        worka.step4("name");
        worka.step5(232);


        // 2.使用门面模式，定义个一个门面工具类给用户使用
        // 这样，用户就不用管具体的实现步骤了
        FacadeUtils utils = new FacadeUtils(new WorkA());
        utils.doWork(2f,3,"name",232);

        // 3.还有一个好处，我们有新需求，可以在门面里面进行一些修改
        // 而用户只管调用之前的doWork方法。
        // 比如 在FacadeUtils的doWork方法中插入一个checkData方法，进行数据检查，但是用户还是照常使用这个方法，完全不需要关心
    }
}
