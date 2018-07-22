package com.mj.thread.lock;

/**
 * Created by Administrator on 2018/6/11 0011.
 */
public class ThreadA extends Thread {
    private MyService myService ;

    public ThreadA(MyService myService){
        super();
        myService = myService ;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
