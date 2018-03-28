package com.mj.designpattern.singleton;

/**
 * 懒汉模式-双重校验且保证可见性
 */
public class Singleton03_02 {

    private static volatile Singleton03_02 instance ;
    private Singleton03_02(){}
    public static Singleton03_02 getInstance(){
        if(instance == null ){
            synchronized (Singleton03_02.class){
                if(instance == null){
                    instance = new Singleton03_02();
                }
            }
        }
        return instance ;
    }

}
