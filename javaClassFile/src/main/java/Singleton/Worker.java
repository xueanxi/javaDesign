package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 代单例设计模式
 *
 *
 */
public class Worker implements Runnable{

    @Override
    public void run() {
        SingletonUtils.getInstance().doWork();
    }
}
