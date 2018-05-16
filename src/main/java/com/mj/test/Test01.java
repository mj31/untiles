package com.mj.test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 */
public class Test01 {

    static class OOMObject{}
    public static void main(String[] args) {
        List<OOMObject> list = Lists.newArrayList();
        while(true){
            list.add(new OOMObject());
        }


    }

}
