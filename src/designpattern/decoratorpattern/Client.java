package designpattern.decoratorpattern;

import designpattern.decoratorpattern.decorator.ExtraCheese;
import designpattern.decoratorpattern.decorator.ExtraChicken;
import designpattern.decoratorpattern.decorator.ExtraMushroom;
import designpattern.decoratorpattern.pizaa.BasePizza;
import designpattern.decoratorpattern.pizaa.FarmHouse;
import designpattern.decoratorpattern.pizaa.VegDelight;

public class Client {
    public static void main(String[] args)
    {

        BasePizza basePizza1=new ExtraCheese(new FarmHouse());
        BasePizza basePizza2=new ExtraMushroom(new ExtraCheese(new VegDelight()));

        BasePizza basePizza3=new ExtraChicken(new ExtraMushroom(new ExtraCheese(new VegDelight())));
        System.out.println(basePizza1.cost());
        System.out.println(basePizza2.cost());
        System.out.println(basePizza3.cost());



    }
}
