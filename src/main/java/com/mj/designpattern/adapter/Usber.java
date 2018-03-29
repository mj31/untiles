package com.mj.designpattern.adapter;

public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("我是usb接口");
    }
}
