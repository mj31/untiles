package com.mj.callback.callback3;

public class Hr {
    private CallBack3 callBack3 ;

    public Hr(CallBack3 callBack3){
        this.callBack3=callBack3;
    }

    public void tellTaMell(){
        System.out.println("我是hr");
        callBack3.tellTaMeet();
    }
}
