package designpattern.strategeypattern.withoutstrategypattern;

public class Main {
    public static void main(String args[])
    {
        Vehicle vehicle=new Vehicle();
        Vehicle vehicle1=new Normalvehicle();
        Vehicle vehicle2=new SportVehicle();
        Vehicle vehicle3=new OffRoadVehicle();
        vehicle.drive();
        vehicle1.drive();
        vehicle2.drive();// redundancy of vehicle2 , vehicle3 drive method as both child need same capability but inheritance is not
        //able to handle it we can use strategy pattern

        /*
           https://refactoring.guru/design-patterns/strategy

            Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.

            The Strategy pattern lets you indirectly alter the object’s behavior at runtime by associating it with different sub-objects which can perform specific sub-tasks in different ways.

            Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

            The Strategy pattern lets you extract the varying behavior into a separate class hierarchy and combine the original classes into one, thereby reducing duplicate code.

            Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.

            The Strategy pattern lets you isolate the code, internal data, and dependencies of various algorithms from the rest of the code. Various clients get a simple interface to execute the algorithms and switch them at runtime
         */

        vehicle3.drive();//


    }
}
