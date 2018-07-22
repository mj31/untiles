package com.mj.thread.demo4;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class Client {
    public static void main(String[] args)throws Exception {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        Thread.sleep(1000);
        System.out.println("我要停止线程："+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
