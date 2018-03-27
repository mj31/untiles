package com.mj.factory.simplefactory;

public class Driver {
    public static Car driverCar(String s) {
        if (s.equalsIgnoreCase("Benz"))
            return new Benz();
        else if (s.equalsIgnoreCase("Bmw"))
            return new Bmw();

        return null ;
    }
}
