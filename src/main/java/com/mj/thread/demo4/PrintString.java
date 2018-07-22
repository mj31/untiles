package com.mj.thread.demo4;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class PrintString implements Runnable {
    private boolean isContinuePrint = true ;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void run() {
        try {
            while (isContinuePrint){
                System.out.println("线程："+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
