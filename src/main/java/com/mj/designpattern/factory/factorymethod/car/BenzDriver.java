package com.mj.designpattern.factory.factorymethod.car;


public class BenzDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
