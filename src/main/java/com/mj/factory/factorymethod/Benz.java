package com.mj.factory.factorymethod;

import com.mj.factory.simplefactory.Car;

public class Benz implements Car {
    @Override
    public void driver() {
        System.out.println("Driving Benz");
    }
}
