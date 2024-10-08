package designpattern.decoratorpattern.decorator;

import designpattern.decoratorpattern.pizaa.BasePizza;

public class ExtraChicken extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraChicken(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+100;
    }
}
