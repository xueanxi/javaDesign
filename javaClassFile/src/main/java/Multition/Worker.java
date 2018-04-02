package Multition;

import Singleton.SingletonUtils;

/**
 * 代单例设计模式
 *
 *
 */
public class Worker implements Runnable{

    @Override
    public void run() {
        MultitionUtils.getInstance().doWork();
    }
}
