package templateMethod;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class BaomaCar extends Car {
    @Override
    protected void start() {
        PrintUtils.pl("宝马车启动了");
    }

    @Override
    protected void alarm() {
        PrintUtils.pl("宝马车鸣喇叭了");
    }

    @Override
    protected void enginboom() {
        PrintUtils.pl("宝马车引擎发出轰鸣声");
    }

    @Override
    protected void stop() {
        PrintUtils.pl("宝马车停下来了");
    }

    @Override
    public boolean isAlarm() {
        return super.isAlarm();
    }

    public void setAlarm(boolean isAlarm){
        this.isAlarm = isAlarm;
    }
}
