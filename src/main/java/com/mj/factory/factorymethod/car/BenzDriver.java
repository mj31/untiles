package com.mj.factory.factorymethod.car;


public class BenzDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
