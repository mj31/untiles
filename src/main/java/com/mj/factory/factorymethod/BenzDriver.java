package com.mj.factory.factorymethod;


public class BenzDriver implements Driver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
