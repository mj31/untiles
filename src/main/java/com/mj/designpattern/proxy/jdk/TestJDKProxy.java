package com.mj.designpattern.proxy.jdk;

import com.mj.designpattern.proxy.IUserDao;
import com.mj.designpattern.proxy.UserDao;

public class TestJDKProxy {

    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        //jdk
        //IUserDao proxy = (IUserDao)new ProxyFactory(userDao).getTransactionProxyInstance();
        IUserDao proxy = (IUserDao)new LogHandler(userDao).getInstance();
        proxy.save();
        proxy.delete(123L);
        proxy.update(12344L,"小明");
    }

}
