package com.mj.designpattern.proxy.stat;

import com.mj.designpattern.proxy.IUserDao;


public class UserDaoProxy implements IUserDao {
    private IUserDao userDao ;
    public UserDaoProxy(IUserDao userDao){
        this.userDao = userDao ;
    }
    @Override
    public void save() {
        System.out.println("开始代理");
        userDao.save();
        System.out.println("结束代理");
    }
}
