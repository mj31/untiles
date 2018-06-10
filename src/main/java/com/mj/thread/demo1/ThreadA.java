package com.mj.thread.demo1;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum has ;
     public ThreadA(HasSelfPrivateNum has){
         this.has = has ;
     }

    @Override
    public void run() {
        super.run();
        has.addI("a");
    }
}
