package Facade;

/**
 * 定义一个接口，这个接口是干一件事情的步骤，每个步骤需要传入不同的参数。
 */

public interface IDoWorkStep {
    void step1(float data1);
    void step2(int number);
    void step3();
    void step4(String name);
    void step5(long data2);
}
