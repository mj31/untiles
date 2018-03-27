package com.mj.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle："+sampleParameter);
    }
}
