package com.mj.designpattern.command;

public class Client {
    public static void main(String[] args) {
        Tv myTv = new Tv();
        Command commandOn = new CommandOn(myTv);
        Command commandOff = new CommandOff(myTv);
        Control control = new Control(commandOn,commandOff);
        control.turnOn();
        control.turnOff();
    }
}
