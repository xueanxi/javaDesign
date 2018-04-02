package Singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Proxy.Proxy;

/**
 * 代单例设计模式
 *
 * 这里实现了两个单例模式，但是 SingletonUtils 这个单例模式比较好， SingletonUtils2这个单例模式多线程会有异常。
 */
public class MainClass {

    private static ExecutorService mExecutor;
    public static void main (String[] arg) {

        mExecutor = Executors.newCachedThreadPool();


        for(int i =0;i<3000;i++){
            mExecutor.execute(new Worker());
        }


/*        for(int i =0;i<3000;i++){
            mExecutor.execute(new Worker2());
        }*/


    }
}
