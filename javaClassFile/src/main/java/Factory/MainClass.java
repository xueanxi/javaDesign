package Factory;


import java.io.IOException;
import java.util.concurrent.ExecutorService;

/**
 * 普通的工厂 设计模式
 *
 * 这个例子中，这要传进类名，就可以生产出该类的产品
 *
 * 这里的 工厂使用了两种方式来创建对象。
 */
public class MainClass {

    private static ExecutorService mExecutor;
    public static void main (String[] arg) throws IOException, ClassNotFoundException {

        // 工厂方法一
        IFunction product1 = Factory.createProduct(Product1.class);
        product1.doWork();
        IFunction product2 = Factory.createProduct(Product2.class);
        product2.doWork();
        IFunction product3 = Factory.createProduct(Product3.class);
        product3.doWork();

        // 工厂方法二
        for(int i =0;i<1000;i++) {
            IFunction function = Factory.createProductWithInterface(IFunction.class);
            function.doWork();
        }

        /*
        // 使用工厂方法一生产的产品，因为是使用HashMap优化过的，导致是同一个对象，
        // 导致修改一个，其他对象也会跟着变化。
        Product1 product1 = (Product1) Factory.createProduct(Product1.class);
        product1.display();

        product1.setName("new product1");
        product1.display();

        Product1 Product1_2 = (Product1) Factory.createProduct(Product1.class);
        Product1_2.display();*/



    }
}
