package com.mj.designpattern.command;

/**
 * 命令接收者Receiver
 */
public class Tv {
    public void turnOn() {
        System.out.println("The televisino is on.");
    }

    public void turnOff() {
      System.out.println("The television is off.");
    }

}
