package com.mj.reflect;

import java.lang.reflect.Field;

/**
 * 获取成员变量
 */
public class Client02 {
    public static void main(String[] args)throws Exception {
        Class clazz = Class.forName("com.mj.reflect.Student");
        /*Field[] fields = clazz.getFields();
        for(Field field:fields){
            System.out.println(field);
        }*/

        /*Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field);
        }*/

        Field field = clazz.getDeclaredField("age");
        System.out.println(field);

        Object obj = clazz.getConstructor().newInstance();
        field.setInt(obj,12);
        Student student = (Student)obj;
        System.out.println(student.age);
    }
}
