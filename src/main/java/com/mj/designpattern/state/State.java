package com.mj.designpattern.state;

public interface State {
    /**
     * 状态对应的处理
     * @param sampleParameter
     */
    void handle(String sampleParameter);
}
