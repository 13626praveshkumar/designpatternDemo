package designpattern.decoratorpattern.pizaa;

import designpattern.decoratorpattern.pizaa.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
