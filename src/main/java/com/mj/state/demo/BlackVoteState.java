package com.mj.state.demo;

/**
 * 黑名单
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("用户:"+user+"进入黑名单,禁止投票");
    }
}
