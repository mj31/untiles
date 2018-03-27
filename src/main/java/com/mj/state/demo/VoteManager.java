package com.mj.state.demo;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 考虑一个在线投票系统的应用，要实现控制同一个用户只能投一票，
 * 如果一个用户反复投票，而且投票次数超过5次，则判定为恶意刷票，要取消该用户投票的资格，
 * 当然同时也要取消他所投的票；如果一个用户的投票次数超过8次，将进入黑名单，禁止再登录和使用系统。
 */
public class VoteManager {

    private VoteState state = null ;

    //记录用户投票结果  用户名和投票选项
    private Map<String,String> mapVote = Maps.newHashMap();
    //用户名和投票次数
    private Map<String,Integer> mapVoteCount = Maps.newHashMap();

    /**
     * 获取用户投票结果的map
     * @return
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user,String voteItem){
        //1.为该用户增加投票次数
        //从记录中取出该用户已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if(oldVoteCount == null){
            oldVoteCount = 0 ;
        }
        oldVoteCount++;
        mapVoteCount.put(user,oldVoteCount);

        if(oldVoteCount == 1){
            state = new NormalVoteState();
        }else if(oldVoteCount > 1 && oldVoteCount < 5){
            state = new RepeatVoteState();
        }else if(oldVoteCount >= 5 && oldVoteCount <8){
            state = new SpiteVoteState();
        }else if(oldVoteCount > 8){
            state = new BlackVoteState();
        }
        state.vote(user,voteItem,this);

    }
}
