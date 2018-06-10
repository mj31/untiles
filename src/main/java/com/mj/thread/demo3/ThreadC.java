package com.mj.thread.demo3;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class ThreadC extends Thread {

    private Task2 mTask2;

    public ThreadC(Task2 tk){
        mTask2 = tk;
    }

    public void run() {
        mTask2.doLongTimeTaskC();
    }
}
