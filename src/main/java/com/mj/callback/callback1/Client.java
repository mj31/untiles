package com.mj.callback.callback1;

public class Client {
    public static void main(String[] args) {
        Xer xer = new Xer(new Me());
        xer.toCallMe();
    }
}
