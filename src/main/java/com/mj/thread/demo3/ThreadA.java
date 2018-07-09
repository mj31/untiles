package com.mj.thread.demo3;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class ThreadA extends Thread {

    private Task2 mTask2;

    public ThreadA(Task2 tk){
        mTask2 = tk;
    }

    @Override
    public void run() {
        mTask2.doLongTimeTaskA();
    }


}
