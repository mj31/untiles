package com.mj.reflect;

import java.lang.reflect.Constructor;

/**
 * 构造方法
 */
public class Client01 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.mj.reflect.Student");
            //2.获取所有公有构造方法
            System.out.println("**********************所有公有构造方法*********************************");
            /*Constructor[] constructors = clazz.getConstructors();
            for(int i = 0 ; i < constructors.length;i++){
                System.out.println(constructors[i]);
            }

            System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
            constructors = clazz.getDeclaredConstructors();
            for(int i = 0 ; i < constructors.length;i++){
                System.out.println(constructors[i]);
            }*/

            /*Constructor name = clazz.getConstructor(String.class, int.class);
            name.newInstance(new String("zhangsan"),12);*/

            Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
            declaredConstructor.setAccessible(true);//暴力破解
            //调用构造方法
            declaredConstructor.newInstance(12);


        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
