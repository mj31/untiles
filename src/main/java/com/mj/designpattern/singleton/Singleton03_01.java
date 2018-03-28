package com.mj.designpattern.singleton;

/**
 * 懒汉模式 - 双重校验
 */
public class Singleton03_01 {
    private static Singleton03_01 instance ;
    private Singleton03_01(){}
    public static Singleton03_01 getInstance(){
        if(instance == null){
            synchronized (Singleton03_01.class){
                if(instance == null){
                    instance = new Singleton03_01();
                }
            }
        }
        return instance ;
    }
}
