package com.mj.thread.demo6;

/**
 * Created by Administrator on 2018/6/11 0011.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for(int i = 0 ; i < 10 ;i++){
                Tools.tl.set("ThreadB"+(i+1));
                System.out.println("ThreadB get Value "+Tools.tl.get());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
