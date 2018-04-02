package Adapter;


import java.io.IOException;
import java.util.concurrent.ExecutorService;

import utils.PrintUtils;

/**
 * 适配器 设计模式
 *
 * AmeriaToChinaPerson 和 AmeriaToChinaPerson2 就是适配器，用于适配美国人到中国来的适配
 *
 *
 */
public class MainClass {

    private static ExecutorService mExecutor;
    public static void main (String[] arg) throws IOException, ClassNotFoundException {
        // 一开始大家都使用自己国家的方式来判断是否是有钱人
        // 中国接口中，超过3000元的就是有钱人
        // 美国接口中,超过5000元的才是有钱人
        ChinaPerson xiaoming = new ChinaPerson("xiaoming",4000);
        xiaoming.isYouQianRen();
        ChinaPerson xiaobai = new ChinaPerson("xiaobai",2000);
        xiaobai.isYouQianRen();


        AmericaPerson tom = new AmericaPerson("Tom",4000);
        tom.isRichPerson();
        AmericaPerson peter = new AmericaPerson("peter",6000);
        peter.isRichPerson();

        // 方式一:类适配器
        // 后来tom要移民到中国了，就需要使用中国的方式来计算，但是他是一个美国人，这个是无法更改的事实，所以只能使用适配器来转换以下。
        // 使用适配器 AmeriaToChinaPerson 转换后，美国人也可以调用 isYouQianRen()方法来判断，一个在中国是否是有钱人。
        PrintUtils.pl("Tom 来到中国之后...");
        AmeriaToChinaPerson tom2 = new AmeriaToChinaPerson("Tom",4000);
        tom2.isYouQianRen();

        // 方式二：对象适配器
        AmeriaToChinaPerson2 tom3 = new AmeriaToChinaPerson2(tom);
        tom3.isYouQianRen();

    }
}
