package com.mj.designpattern.decorator;

/**
 * 定义抽象装饰物
 *
 */
public abstract class AbstractClothes implements AbstractPerson {

    AbstractPerson abstractPerson ;
    public AbstractClothes(AbstractPerson abstractPerson){
        this.abstractPerson = abstractPerson;
    }

    @Override
    public  void show() {
        abstractPerson.show();
    }
}
