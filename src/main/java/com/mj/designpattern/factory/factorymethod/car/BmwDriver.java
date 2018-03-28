package com.mj.designpattern.factory.factorymethod.car;

public class BmwDriver implements Driver {
    @Override
    public Car driverCar() {
        return  new Bmw();
    }
}
