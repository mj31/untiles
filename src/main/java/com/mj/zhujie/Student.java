package com.mj.zhujie;

public class Student {

    @ExcelField(title = "我是title")
    public void getDataByStr(String str){
        System.out.println(str);
    }
}
