package templateMethod;

/**
 * 模板车类
 *
 * 用户关注的只有 run()，让车跑起来，而 run() 是有步骤的, 在这里 run就是模板方法,不需要子类去实现。
 * 其他的 start alarm enginboom stop是基本方法，需要子类取实现。
 * isAlarm 是钩子方法，是父类已经实现了的，子类可以选择是否重写实现。
 */

public abstract class Car {

    boolean isAlarm = true;

    /**
     * 车开起来
     */
    protected abstract void start();

    /**
     * 车响喇叭
     */
    protected abstract void alarm();

    /**
     * 引擎响
     */
    protected abstract void enginboom();

    /**
     * 车停下来
     */
    protected abstract void stop();

    public final void run(){
        start();
        if(isAlarm()){
            alarm();
        }
        enginboom();
        stop();
    }

    public boolean isAlarm() {
        return isAlarm;
    }
}
