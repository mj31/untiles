package com.mj.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 成员方法
 */
public class Client03 {
    public static void main(String[] args)throws Exception {
        Class clazz = Class.forName("com.mj.reflect.Student");
        /*Method show2 = clazz.getMethod("show1",String.class);
        Object obj = clazz.getConstructor().newInstance();
        show2.invoke(obj,"刘得花");*/
        Student student = (Student) clazz.newInstance();
        student.show2();


    }
}
