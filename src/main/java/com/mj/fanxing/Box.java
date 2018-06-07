package com.mj.fanxing;

/**
 * 泛型类
 * @param <T>
 */
public class Box<T> {
    private T obj ;
    public void set(T t){
        this.obj = t ;
    }

    public T get(){
        return this.obj;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("123");
        System.out.println(box.get());
    }

}
