package designpattern.strategeypattern.withstrategypattern;

import designpattern.strategeypattern.withstrategypattern.strategy.IVehicleStrategy;

public class Vehicle {

    IVehicleStrategy iVehicleStrategy;

    public Vehicle(IVehicleStrategy iVehicleStrategy) {
        this.iVehicleStrategy = iVehicleStrategy;
    }
    
    public void drive()
    {
        iVehicleStrategy.drive();
    }
}
