package com.mj.designpattern.observer;

public class User implements MyObserver {
    private String mName;
    public User(String name) {
        mName = name;
    }
    @Override
    public void receive(NewsModel model) {
        System.out.println(mName + " receive news:" + model.getTitle() + " " + model.getContent());
    }

}
