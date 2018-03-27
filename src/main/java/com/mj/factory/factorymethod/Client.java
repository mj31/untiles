package com.mj.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        Driver driver = new BenzDriver();
        Car car = driver.driverCar();
        car.driver();
    }
}
