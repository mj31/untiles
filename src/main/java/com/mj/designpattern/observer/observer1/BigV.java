package com.mj.designpattern.observer.observer1;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
public class BigV implements PublicNumber {

    private List<UserObserver> list = Lists.newArrayList();

    private Message message ;


    public void setMessage(Message message) {
        sendMessage(message);
    }

    @Override
    public void register(UserObserver userObserver) {
            list.add(userObserver);
    }

    @Override
    public void remove(UserObserver userObserver) {
        list.remove(userObserver);
    }

    @Override
    public void sendMessage(Message message) {
        System.out.print("订阅消息\r\n");
        for (UserObserver v:list) {
            v.receiveMessage(message);
        }
    }
}
