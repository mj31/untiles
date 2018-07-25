package com.mj.designpattern.observer.observer1;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
public class User implements UserObserver {


    private String userName ;

    public User(String userName){
        this.userName = userName ;
    }


    @Override
    public void receiveMessage(Message message) {
        System.out.println("订阅消息：【"+userName+"】获取了消息标题是："+message.getTitle()+",消息内容是："+message.getContent());
    }
}
