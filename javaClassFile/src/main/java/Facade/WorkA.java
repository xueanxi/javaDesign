package Facade;

import utils.PrintUtils;

/**
 * 实现了 IDoWorkStep 接口，
 * 实现每个步骤需要干的事情
 */

public class WorkA implements IDoWorkStep {


    @Override
    public void step1(float data1) {
        PrintUtils.pl("WorkA : step1("+data1+")");
    }

    @Override
    public void step2(int number) {
        PrintUtils.pl("WorkA : step1("+number+")");
    }

    @Override
    public void step3() {
        PrintUtils.pl("WorkA : step3()");
    }

    @Override
    public void step4(String name) {
        PrintUtils.pl("WorkA : step1("+name+")");
    }

    @Override
    public void step5(long data2) {
        PrintUtils.pl("WorkA : step1("+data2+")");
    }
}
