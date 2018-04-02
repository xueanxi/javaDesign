package Factory;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class Product1 implements IFunction {

    @Override
    public void doWork() {
        PrintUtils.pl("i can do work1");
    }
}
