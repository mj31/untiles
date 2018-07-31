package com.mj.designpattern.proxy;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }

    @Override
    public void delete(Long id) {
        System.out.println("删除：id="+id);
    }

    @Override
    public void update(Long id, String userName) {
        System.out.println("更新:id="+id+",userName="+userName);
    }
}
