package com.mj.designpattern.state.demo;

/**
 * 重复投票
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("用户:"+user+"重复投票");
    }
}
