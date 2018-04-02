package Strategy;

/**
 * 策略设计模式
 */
public class MainClass {
    public static void main (String[] arg) {
        // 执行不同的策略，只需要传入不同的实现接口就可以。
        Strategy strategy = new Strategy(new StrategyImpl_1());
        strategy.doSomeThing();

        strategy = new Strategy(new StrategyImpl_2());
        strategy.doSomeThing();

        strategy = new Strategy(new StrategyImpl_3());
        strategy.doSomeThing();
    }
}
