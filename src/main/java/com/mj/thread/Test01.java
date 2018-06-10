package com.mj.thread;

/**
 * Created by Administrator on 2018/6/5 0005.
 */
public class Test01 extends Thread {

    @Override
    public void run() {
        for(int i = 0 ; i < 500000 ;i++){
            System.out.println("循环==="+i);
        }
    }

    public static void main(String[] args)throws Exception {
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
        Test01 test01 = new Test01();
        test01.start();
        System.out.println("12");
        test01.interrupt(); //执行完才
        // test01.stop(); 直接停止

    }
}
