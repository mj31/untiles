package com.mj.designpattern.adapter.obj;

import com.mj.designpattern.adapter.Ps2;
import com.mj.designpattern.adapter.Usber;

public class Client {
    public static void main(String[] args) {
        Ps2 ps = new Adapter(new Usber());
        ps.isPs2();
    }
}
