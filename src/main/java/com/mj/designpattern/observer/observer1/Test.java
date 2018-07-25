package com.mj.designpattern.observer.observer1;

/**
 * Created by Administrator on 2018/7/25 0025.
 */
public class Test {
    public static void main(String[] args) {

        BigV bigV = new BigV();
        User user1 ;
        for(int i = 0 ; i < 10 ; i++){
            user1 = new User("小明"+i);
            bigV.register(user1);
        }

        Message m1 ;
        for(int i = 0 ; i < 10 ;i++){
            m1 = new Message();
            m1.setContent("消息内容"+i);
            m1.setTitle("消息标题"+i);
            bigV.setMessage(m1);
        }

    }
}
