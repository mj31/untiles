package com.mj.thread.demo3;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class Task2 {
    public synchronized static void doLongTimeTaskA() {
        System.out.println("name = " + Thread.currentThread().getName() + ", begain");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name = " + Thread.currentThread().getName() + ", end");
    }


    public synchronized  void doLongTimeTaskB() {
        System.out.println("name = " + Thread.currentThread().getName() + ", begain");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name = " + Thread.currentThread().getName() + ", end");
    }

    public synchronized  void doLongTimeTaskC() {

        System.out.println("name = " + Thread.currentThread().getName() + ", begain");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("name = " + Thread.currentThread().getName() + ", end");

    }
}
