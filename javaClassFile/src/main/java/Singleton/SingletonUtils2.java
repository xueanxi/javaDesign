package Singleton;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class SingletonUtils2 {
    private static SingletonUtils2 instance;

    private SingletonUtils2(){}

    public static  SingletonUtils2 getInstance(){
        if(instance  == null){
            instance = new SingletonUtils2();
        }
        return instance;
    }


    int i = 0;
    public synchronized void doWork(){
        i++;
        PrintUtils.pl("myName is "+this+" . i do work number :" + i);
    }
}
