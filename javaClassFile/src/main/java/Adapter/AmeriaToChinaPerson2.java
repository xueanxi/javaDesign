package Adapter;

import utils.PrintUtils;

/**
 * 对象适配器，使用传入对象参数，来获取数据
 */

public class AmeriaToChinaPerson2  implements ChinaManager {
    AmericaPerson americaPerson;

    public AmeriaToChinaPerson2(AmericaPerson americaPerson) {
        this.americaPerson = americaPerson;
    }

    @Override
    public void isYouQianRen() {
        if (this.americaPerson.money - rich_monny > 0) {
            PrintUtils.pl(this.americaPerson.name +" 在中国是有钱人");
        } else {
            PrintUtils.pl(this.americaPerson.name +" 在中国是穷人");
        }
    }
}
