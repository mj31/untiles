package com.mj.thread;

import org.omg.CORBA.Object;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
public class MyThread extends Thread {

    private  int count = 7 ;
    @Override
    public void run() {
        synchronized (Object.class){
            System.out.println(Thread.currentThread().getName()+",count="+(count--));
        }

    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread threadA= new Thread(myThread,"A");
        Thread threadB= new Thread(myThread,"B");
        Thread threadC= new Thread(myThread,"C");
        Thread threadD= new Thread(myThread,"D");
        Thread threadE= new Thread(myThread,"E");
        Thread threadF= new Thread(myThread,"F");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
        threadF.start();

    }
}
