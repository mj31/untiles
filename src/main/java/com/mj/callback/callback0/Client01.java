package com.mj.callback.callback0;

public class Client01 {

    public static void main(String[] args) {
        Emplee emplee = new Emplee(new Boss());
        emplee.doEvent();
    }
}
