package com.mj.designpattern.adapter.obj;

import com.mj.designpattern.adapter.Ps2;
import com.mj.designpattern.adapter.Usber;

public class Adapter implements Ps2 {
    private Usber usber ;
    public Adapter(Usber usber){
        this.usber = usber ;
    }
    @Override
    public void isPs2() {
        usber.isUsb();
    }
}
