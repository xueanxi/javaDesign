package Adapter;

import utils.PrintUtils;

/**
 * 类适配器，使用继承方式来获取数据
 */

public class AmeriaToChinaPerson extends AmericaPerson implements ChinaManager {

    public AmeriaToChinaPerson(String name, int money) {
        super(name, money);
    }

    @Override
    public void isYouQianRen() {
        if (this.money - rich_monny > 0) {
            PrintUtils.pl(this.name +" 在中国是有钱人");
        } else {
            PrintUtils.pl(this.name +" 在中国是穷人");
        }
    }
}
