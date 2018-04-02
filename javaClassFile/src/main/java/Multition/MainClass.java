package Multition;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



/**
 * 多例 设计模式
 *
 * 这个例子中，多例只会产生两个例子，不会产生更多。
 */
public class MainClass {

    private static ExecutorService mExecutor;
    public static void main (String[] arg) {

        mExecutor = Executors.newCachedThreadPool();

        for(int i =0;i<3000;i++){
            mExecutor.execute(new Worker());
        }
    }
}
