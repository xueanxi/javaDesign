package javadesign.anxi.com.javadesign.StrategyPattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 3/31/18.
 */

public class Strategy {
    IStrategy iStrategy;

    public Strategy(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operate(){
        if(this.iStrategy != null){
            iStrategy.operate();
        }
    }
}
