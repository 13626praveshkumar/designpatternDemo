package designpattern.strategeypattern.withstrategypattern.strategy;

public class NormalStrategy implements IVehicleStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Strategy");
    }
}
