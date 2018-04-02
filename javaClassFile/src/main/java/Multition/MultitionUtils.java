package Multition;

import java.util.ArrayList;
import java.util.Random;

import utils.PrintUtils;

/**
 * 多例工具类，和单例不同，它可以生成多个例子。但是不是无限生成，而是有限制个数的。
 *
 * 比如下面这个例子就是限制生成2个的
 */

public class MultitionUtils {
    private static final int maxNumber = 2;
    private static ArrayList<MultitionUtils> instanceList = new ArrayList<MultitionUtils>(maxNumber);

    private String utilName;

    static{
        for(int i=0;i<maxNumber;i++){
            instanceList.add(new MultitionUtils("utils:"+i));
        }
    }

    private MultitionUtils(String utilName){
        this.utilName = utilName;
    }

    public static synchronized MultitionUtils getInstance(){
        int random = new Random().nextInt(maxNumber);
        return instanceList.get(random);
    }


    public void showMyName(){
        PrintUtils.pl("myName is "+this.utilName);
    }

    int i = 0;
    public synchronized void doWork(){
        i++;
        PrintUtils.pl("myName is "+this.utilName+" . i do work number :" + i);
    }
}
