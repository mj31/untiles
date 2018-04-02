package com.mj.designpattern.command;

/**
 * 可以看作是遥控器Invoker
 */
public class Control {
    private  Command onCommand ;
    private  Command offCommand ;
    public  Control(Command myOnCommand,Command myOffCommand){
        onCommand = myOnCommand ;
        offCommand = myOffCommand ;
    }

    public void turnOn(){
        onCommand.execute();
    }

    public void turnOff(){
        offCommand.execute();
    }


}
