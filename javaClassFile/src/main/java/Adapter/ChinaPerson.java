package Adapter;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class ChinaPerson implements ChinaManager {

    protected int money;
    protected String name;

    public ChinaPerson(String name,int money) {
        this.money = money;
        this.name = name;
    }

    @Override
    public  void isYouQianRen() {
        if (this.money - rich_monny > 0) {
            PrintUtils.pl(this.name +" 是有钱人");
        } else {
            PrintUtils.pl(this.name +" 是穷人");
        }
    }
}
