package Adapter;

import utils.PrintUtils;

/**
 * Created by user on 4/2/18.
 */

public class AmericaPerson implements AmericaManager {

    protected int money;
    protected String name;

    public AmericaPerson(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public void isRichPerson() {
        if (this.money - rich_monny2 > 0) {
            PrintUtils.pl(this.name +" 在美国是有钱人");
        } else {
            PrintUtils.pl(this.name +" 在美国是穷人");
        }
    }
}
