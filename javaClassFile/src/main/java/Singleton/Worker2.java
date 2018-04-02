package Singleton;

/**
 * 代单例设计模式
 *
 *
 */
public class Worker2 implements Runnable{

    @Override
    public void run() {
        SingletonUtils2.getInstance().doWork();
    }
}
