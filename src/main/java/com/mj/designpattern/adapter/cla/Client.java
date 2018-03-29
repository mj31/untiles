package com.mj.designpattern.adapter.cla;

import com.mj.designpattern.adapter.Ps2;

public class Client {
    public static void main(String[] args) {
        Ps2 ps = new Adapter();
        ps.isPs2();
    }
}
