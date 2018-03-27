package com.mj.factory.factorymethod.car;

public class BmwDriver implements Driver {
    @Override
    public Car driverCar() {
        return  new Bmw();
    }
}
