package com.mj.state.demo;

/**
 * 恶意刷票
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String str = voteManager.getMapVote().get(user);
        if(str != null){
            voteManager.getMapVote().remove(user);
        }
        System.out.println("用户:"+user+" 恶意刷屏行为，取消投票资格");
    }
}
