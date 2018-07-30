package com.mj.callback.callback1;

public class Xer {
    CallBack1 callBack1 ;

    public Xer(CallBack1 callBack1){
        this.callBack1 = callBack1;
    }

    public void toCallMe(){
        System.out.println("我是小二");
        callBack1.call();
    }
}
