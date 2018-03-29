package com.mj.designpattern.adapter.cla;

import com.mj.designpattern.adapter.Ps2;
import com.mj.designpattern.adapter.Usber;

public class Adapter extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
