package com.mj.callback;

public class Client01 {

    public static void main(String[] args) {
        Emplee emplee = new Emplee(new Boss());
        emplee.doEvent();
        String name = "haimayuedu##你的郁##金香小姐";
        System.out.println(name.substring(name.lastIndexOf("##")+2));
    }
}
