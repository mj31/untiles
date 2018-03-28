package com.mj.designpattern.state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.request("test");
    }
}
