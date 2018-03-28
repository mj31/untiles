package com.mj.designpattern.state;

public class Context {
    //持有一个state类型的对象实例
    private State state ;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter){
        state.handle(sampleParameter);
    }


}
