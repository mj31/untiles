package com.mj.designpattern.observer;

/**
 * 被观察者定义接口
 */
public interface MyObserverable {
    void register(MyObserver myObserver);

    void remove(MyObserver myObserver);

    void send(NewsModel model);

}
