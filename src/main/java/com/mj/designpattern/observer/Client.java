package com.mj.designpattern.observer;

/**
 * 用户从报社订阅报纸，报社和用户之间是一对多依赖，
 * 用户可以在报社订阅（register）报纸，报社可以把最新的报纸发给用户（notify），
 * 用户自动收到更新。在用户不需要的时候还可以取消注册（remove）。
 */
public class Client {

    public static void main(String[] args) {
        NewsProvider provider = new NewsProvider();
        User user;
        for (int i = 0; i < 10; i++) {
            user = new User("user:"+i);
            provider.register(user);
        }
    }
}
