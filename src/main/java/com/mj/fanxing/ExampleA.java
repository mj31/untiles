package com.mj.fanxing;

/**
 * 泛型方法<T>
 */
public class ExampleA {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());

    }

    public static void main(String[] args) {
        ExampleA a = new ExampleA();
        a.f("123");
    }

}
