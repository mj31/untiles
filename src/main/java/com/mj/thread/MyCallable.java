package com.mj.thread;

import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/6/8 0008.
 */
public class MyCallable{

    public static void main1(String[] args)throws Exception{
        ExecutorService executorService = Executors.newSingleThreadExecutor();
       Future<String> future = executorService.submit(new Callable<String>() {
           @Override
           public String call() throws Exception {
               return "结果是啥";
           }
       });
        System.out.println(future.get());

    }

    public static void main(String[] args) throws Exception{
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return new Random(100).nextInt();
            }
        };
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();
        try {
           // Thread.sleep(1000);
            System.out.println(future.get());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
