package designpattern.strategeypattern.withstrategypattern;

import designpattern.strategeypattern.withstrategypattern.strategy.NormalStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalStrategy());
    }
}
