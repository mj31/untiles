package com.mj.designpattern.observer.observer1;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
public interface PublicNumber {

    void register(UserObserver userObserver);

    void remove(UserObserver userObserver);

    void sendMessage(Message message);
}
