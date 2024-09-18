package designpattern.strategeypattern.withstrategypattern;


import designpattern.strategeypattern.withstrategypattern.strategy.SportsStrategy;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1=new Vehicle(new SportsStrategy());
        Vehicle vehicle2 = new NormalVehicle();
        Vehicle vehicle3 = new OffRoadVehicle();
        Vehicle vehicle4 = new SportVehicle();
        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();
        vehicle4.drive();
    }

}
