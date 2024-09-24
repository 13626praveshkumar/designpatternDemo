package designpattern.decoratorpattern.pizaa;

import designpattern.decoratorpattern.pizaa.BasePizza;

public class FarmHouse extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
