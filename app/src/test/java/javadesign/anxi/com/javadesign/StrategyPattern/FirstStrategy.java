package javadesign.anxi.com.javadesign.StrategyPattern;

/**
 * Created by user on 3/31/18.
 */

public class FirstStrategy implements IStrategy {
    @Override
    public void operate() {
        System.out.print("I am First Strategy.");
    }
}
