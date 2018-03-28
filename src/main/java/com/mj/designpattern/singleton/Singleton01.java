package com.mj.designpattern.singleton;

/**
 * 饿汉模式
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance(){
        return instance;
    }
}
