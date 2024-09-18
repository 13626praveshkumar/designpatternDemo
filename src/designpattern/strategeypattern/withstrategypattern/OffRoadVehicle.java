package designpattern.strategeypattern.withstrategypattern;

import designpattern.strategeypattern.withstrategypattern.strategy.SportsStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsStrategy());
    }
}
