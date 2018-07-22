package com.mj.thread.lock;

/**
 * Created by Administrator on 2018/6/11 0011.
 */
public class Client {

    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA t1 = new ThreadA(myService);
        ThreadA t2 = new ThreadA(myService);
        ThreadA t3 = new ThreadA(myService);
        ThreadA t4 = new ThreadA(myService);
        ThreadA t5 = new ThreadA(myService);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
