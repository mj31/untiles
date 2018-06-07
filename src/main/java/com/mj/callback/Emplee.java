package com.mj.callback;

public class Emplee {
    CallBack callBack ;

    public Emplee(CallBack callBack){
        this.callBack=callBack;
    }

    public void doEvent(){
        System.out.println("我自己做完了");
        callBack.doEvent();
    }
}
