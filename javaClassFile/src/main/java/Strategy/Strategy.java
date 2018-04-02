package Strategy;

/**
 * 策略实体类，这个类的策略都是参数传进来的，传进来不同的策略，就可以使用不同的策略。
 * 扩展性好
 */

public class Strategy {
    IStrategy iStrategy;
    public Strategy(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void doSomeThing(){
        if(iStrategy != null) iStrategy.doSomeThings();
    }
}
