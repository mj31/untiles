package com.mj.designpattern.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Car car = Driver.driverCar("Bmw");
        car.driver();
    }
}
