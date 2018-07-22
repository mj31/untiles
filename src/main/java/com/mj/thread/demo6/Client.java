package com.mj.thread.demo6;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class Client {

    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        ThreadA tA = new ThreadA();
        ThreadB tB = new ThreadB();
        tA.start();
        tB.start();
        try {
            for(int i = 0 ; i < 10 ;i++){
                Tools.tl.set("main"+(i+1));
                System.out.println("main get Value "+Tools.tl.get());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
