package Proxy;

/**
 * 这个是代理类，虽然也实现了 IFunction 接口，但是实际上干活的是 worker，它只是一个代理。
 */

public class Proxy implements IFunction {
    IFunction worker;

    public Proxy(IFunction worker) {
        this.worker = worker;
    }

    @Override
    public void doSomeWork() {
        worker.doSomeWork();
    }

    @Override
    public void doSomeWork2() {
        worker.doSomeWork2();
    }

    @Override
    public void doSomeWork3() {
        worker.doSomeWork3();
    }
}
