package com.mj.designpattern.proxy;

public interface IUserDao {
    void save();
    void delete(Long id);
    void update(Long id,String userName);

}
