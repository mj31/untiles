package com.mj.designpattern.command;

/**
 * 开机命令ConcreteCommand
 */
public class CommandOn implements Command {
    private Tv tv ;

    public CommandOn(Tv myTv){
        tv = myTv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
