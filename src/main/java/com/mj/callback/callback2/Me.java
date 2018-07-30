package com.mj.callback.callback2;

public class Me {
    private CallBack2 callBack2 ;

    public Me(CallBack2 callBack2){
        this.callBack2=callBack2;
    }

    public void toTellGirl(){
        System.out.println("我到了");
        callBack2.tellGirl();
    }
}
