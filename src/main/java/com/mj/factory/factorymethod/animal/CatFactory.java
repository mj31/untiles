package com.mj.factory.factorymethod.animal;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class CatFactory implements FactoryAnimal {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
