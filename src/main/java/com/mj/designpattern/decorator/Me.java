package com.mj.designpattern.decorator;

public class Me implements AbstractPerson {
    @Override
    public void show() {
        System.out.println("我是裸体的哈");
    }
}
