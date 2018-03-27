package com.mj.factory.factorymethod;

public class BmwDriver implements Driver {
    @Override
    public Car driverCar() {
        return (Car) new Bmw();
    }
}
