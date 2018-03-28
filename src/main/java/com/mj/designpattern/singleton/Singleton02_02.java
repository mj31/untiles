package com.mj.designpattern.singleton;

/**
 * 懒汉模式-线程安全
 */
public class Singleton02_02 {
    private static Singleton02_02 instance ;
    private Singleton02_02(){}
    public static synchronized Singleton02_02 getInstance(){
        if(instance == null){
            instance = new Singleton02_02();
        }
        return instance ;
    }
}
