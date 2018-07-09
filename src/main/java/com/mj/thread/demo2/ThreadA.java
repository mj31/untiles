package com.mj.thread.demo2;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class ThreadA extends Thread {
    private MyObject myObject ;
    public  ThreadA(MyObject myObject ){
        this.myObject = myObject ;

    }
    @Override
    public void run() {
        super.run();
        myObject.methodA();

    }
}
