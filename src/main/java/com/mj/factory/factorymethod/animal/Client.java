package com.mj.factory.factorymethod.animal;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class Client {
    public static void main(String[] args) {
        FactoryAnimal f = new CatFactory();
        Animal animal = f.createAnimal();
        animal.eat();
    }
}
