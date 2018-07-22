package com.mj.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2018/6/11 0011.
 */
public class MyService {
    private Lock lock  = new ReentrantLock();

    public void testMethodA(){
        lock.lock();
        for(int i = 0 ; i < 5 ;i++){
            System.out.println("线程:"+Thread.currentThread().getName()+",i="+(i+1));
        }
        lock.unlock();
    }
}
