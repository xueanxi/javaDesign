package Strategy;


import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class StrategyImpl_1 implements IStrategy {
    @Override
    public void doSomeThings() {
        PrintUtils.p("I am StrategyImpl_1");
    }
}
