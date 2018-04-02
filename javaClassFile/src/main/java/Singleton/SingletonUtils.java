package Singleton;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class SingletonUtils {
    private static SingletonUtils instance = new SingletonUtils();

    private SingletonUtils(){}

    public static synchronized SingletonUtils getInstance(){
        return instance;
    }


    int i = 0;
    public synchronized void doWork(){
        i++;
        PrintUtils.pl("myName is "+this+" . i do work number :" + i);
    }
}
