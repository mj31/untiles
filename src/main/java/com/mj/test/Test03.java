package com.mj.test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * VM args: -XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class Test03 {

    public static void main(String[] args) {
        List<String> list = Lists.newArrayList();
        int i = 0 ;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
