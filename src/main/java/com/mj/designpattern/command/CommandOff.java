package com.mj.designpattern.command;

/**
 * 关机命令ConcreteCommand
 */
public class CommandOff implements Command {
    private Tv tv ;

    public CommandOff(Tv myTv){
       this.tv = myTv ;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
