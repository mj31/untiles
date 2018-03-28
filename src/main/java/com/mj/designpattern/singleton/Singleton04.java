package com.mj.designpattern.singleton;

/**
 * 静态内部类实现
 */
public class Singleton04 {
    private static class SingletonHolder{
        public  static  Singleton04 instance = new Singleton04();
    }

    private Singleton04(){}

    public static Singleton04 getInstance(){
        return SingletonHolder.instance ;
    }
}
