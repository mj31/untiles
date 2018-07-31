package com.mj.designpattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target ;

    public ProxyFactory(Object target){
        this.target = target;
    }

    /**
     * 事务
     * @return
     */
    public Object getTransactionProxyInstance(){
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                                    new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("开启事务。。。。");
                    method.invoke(target,args);
                    System.out.println("关闭事务。。。。");
                    return proxy;
                }
        });
        return proxy ;
    }

    /**
     * 日志
     * @return
     */
    public Object getLogProxyInstace(){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开启日志。。。。");
                method.invoke(target,args);
                System.out.println("生成日志结束。。。");
                return proxy;
            }
        });
        return proxy ;
    }
}
