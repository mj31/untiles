package com.mj.callback.callback4;

public class Me {

    private CallBack4 callBack4 ;

    public Me(CallBack4 callBack4){
       this.callBack4 = callBack4 ;
    }

    public void toTellMom(){
        System.out.println("去告诉mom");
        callBack4.call();
    }
}
