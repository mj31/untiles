package com.mj.thread.demo5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class MyThread extends Thread {
    public static volatile int count;

    @Override
    public void run() {
        addCount();
    }

    private    synchronized void addCount() {
        for(int i = 0 ; i < 100 ; i++){
            count++ ;
        }
        System.out.println("count:"+count);
    }

    public static void main(String[] args)throws Exception {
        MyThread[] myThread = new MyThread[100];
        for(int i = 0 ; i < 100 ;i++){
            myThread[i] = new MyThread();
        }

        for(int i = 0 ; i < 100 ;i++){
            myThread[i].join(1000l);
            myThread[i].start();
        }
    }
}
