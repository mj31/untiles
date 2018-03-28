package com.mj.designpattern.singleton;

/**
 * 懒汉模式-非线程安全
 */
public class Singleton02_01 {

    private static Singleton02_01 instance ;
    private Singleton02_01(){}
    public static Singleton02_01 getInstance(){
        if(instance == null){
            instance = new Singleton02_01();
        }
        return instance ;
    }
}
