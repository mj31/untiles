package com.mj.test;

/**
 * VM args:-Xss128k -XX:+PrintGCDetails
 */
public class Test02 {
    private  int stackLength = 1;

    public void stackLeak(){
        stackLength++ ;
        stackLeak();
    }

    public static void main(String[] args)throws Throwable {
        Test02 t=new Test02();
        try {
            t.stackLeak();
        }catch (Throwable e){
            System.out.println("stackLength="+t.stackLength);
            throw e ;
        }


    }
}
