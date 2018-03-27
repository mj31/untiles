package com.mj.state.demo;

public class Client {
    public static void main(String[] args) {
        VoteManager vo = new VoteManager();
        for(int i = 0 ; i < 10;i++){
            vo.vote("小明","篮球");
        }
    }
}
