package Proxy;

import Strategy.Strategy;

/**
 * 代理设计模式
 *
 * 这个设计模式和策略模式有点像，但是这个代理类也是实现了接口的，但是策略模式没有实现接口。
 */
public class MainClass {
    public static void main (String[] arg) {
        Proxy proxy = new Proxy(new FunctionImpl());

        proxy.doSomeWork();
        proxy.doSomeWork2();
        proxy.doSomeWork3();
    }
}
