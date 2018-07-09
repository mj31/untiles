package com.mj.thread.demo1;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
public class Client {
    public static void main1(String[] args) {
        try {
            HasSelfPrivateNum has = new HasSelfPrivateNum();
            ThreadA threadA = new ThreadA(has);
            threadA.start();
            ThreadB threadB = new ThreadB(has);
            threadB.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            HasSelfPrivateNum hasA = new HasSelfPrivateNum();
            HasSelfPrivateNum hasB= new HasSelfPrivateNum();
            ThreadA threadA = new ThreadA(hasA);
            threadA.start();
            ThreadB threadB = new ThreadB(hasB);
            threadB.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
