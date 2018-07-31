package com.mj.callback.callback4;

public class Client4 {
    public static void main(String[] args) {
        Me me = new Me(new Mom());
        me.toTellMom();
    }
}
