package com.mj.callback.callback2;

public class Client {

    public static void main(String[] args) {
        Me me = new Me(new Girl());
        me.toTellGirl();
    }
}
