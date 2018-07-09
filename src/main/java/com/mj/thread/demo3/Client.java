package com.mj.thread.demo3;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public class Client {
    public static void main(String[] args) {
        Task2 taskA = new Task2();
        Task2 taskB = new Task2();
        Task2 taskC= new Task2();
        ThreadA threadA = new ThreadA(taskA);
        ThreadB threadB = new ThreadB(taskB);
        ThreadC threadC = new ThreadC(taskC);
        threadA.setName("A");
        threadB.setName("B");
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();

    }
}
