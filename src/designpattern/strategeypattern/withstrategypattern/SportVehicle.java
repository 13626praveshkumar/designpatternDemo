package designpattern.strategeypattern.withstrategypattern;

import designpattern.strategeypattern.withstrategypattern.strategy.SportsStrategy;

public class SportVehicle extends Vehicle{
    public SportVehicle() {
        super(new SportsStrategy());
    }
}
