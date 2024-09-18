package designpattern.strategeypattern.withstrategypattern.strategy;

public class SportsStrategy implements IVehicleStrategy{
    @Override
    public void drive() {
        System.out.println("Sport Strategy");
    }
}
