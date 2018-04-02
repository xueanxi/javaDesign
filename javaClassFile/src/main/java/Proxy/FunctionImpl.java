package Proxy;

import utils.PrintUtils;

/**
 * 这个是代理类，虽然也实现了 IFunction 接口，但是实际上干活的是 worker，它只是一个代理。
 */

public class FunctionImpl implements IFunction {

    public FunctionImpl() {

    }

    @Override
    public void doSomeWork() {
        PrintUtils.pl("doSomeWork1");
    }

    @Override
    public void doSomeWork2() {
        PrintUtils.pl("doSomeWork2");
    }

    @Override
    public void doSomeWork3() {
        PrintUtils.pl("doSomeWork3");
    }
}
