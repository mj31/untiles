package com.mj.thread.demo2;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class Client {
    public static void main(String[] args) {
        MyObject myObjectA = new MyObject();
        MyObject myObjectB = new MyObject();
        ThreadA threadA = new ThreadA(myObjectA);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObjectB);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
