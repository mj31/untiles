package com.mj.designpattern.builder.house;

public interface Builder {

    /**
     * 打基础
     */
    void  buildBasic();

    /**
     * 砌墙
     */
    void  buildWalls();

    /**
     * 封顶
     */
    void  roofed();

    /**
     * 造房子
     * @return
     */
    Product buildProduct();
}
