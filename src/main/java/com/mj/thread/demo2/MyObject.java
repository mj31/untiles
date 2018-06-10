package com.mj.thread.demo2;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class MyObject {
    public synchronized static void methodA(){
        try {
            System.out.println("begin methodA thread ="+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end methodA thread ="+Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
