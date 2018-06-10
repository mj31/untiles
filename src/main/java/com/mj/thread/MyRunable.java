package com.mj.thread;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunable());
        thread.start();
        System.out.println("执行结束");
    }
}