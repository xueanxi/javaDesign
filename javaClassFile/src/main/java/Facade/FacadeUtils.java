package Facade;

import utils.PrintUtils;

/**
 * 定义一个人来干这件事
 */

public class FacadeUtils {

    WorkA worka;

    public FacadeUtils(WorkA worka){
        this.worka = worka;
    }

    public void doWork(float data,int number,String name,long data2){
        worka.step1(data);
        worka.step2(number);
        worka.step3();

        checkData(); // 后来加上的方法

        worka.step4(name);
        worka.step5(data2);
    }


    private void checkData(){
        PrintUtils.pl("正在检查输入的数据是否正确");
    }
}
