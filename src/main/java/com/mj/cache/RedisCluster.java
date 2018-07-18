package com.mj.cache;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class RedisCluster {

    private static JedisCluster getCluster(){
        String ip = "121.199.20.251" ;
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        // 最大连接数
        poolConfig.setMaxTotal(1);
        // 最大空闲数
        poolConfig.setMaxIdle(1);
        // 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
        // Could not get a resource from the pool
        poolConfig.setMaxWaitMillis(1000);
        Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
        nodes.add(new HostAndPort(ip, 7000));
        nodes.add(new HostAndPort(ip, 7001));
        nodes.add(new HostAndPort(ip, 7002));
        nodes.add(new HostAndPort(ip, 7003));
        nodes.add(new HostAndPort(ip, 7004));
        nodes.add(new HostAndPort(ip, 7005));
        return  new JedisCluster(nodes, poolConfig);
    }

    public static void main(String[] args)throws Exception {
        JedisCluster cluster = RedisCluster.getCluster();
        cluster.del("money");
        Long setnx = cluster.setnx("money", "好人");
        System.out.println(setnx);
        cluster.del("money");
        Long setnx1 = cluster.setnx("money", "好人");
        Long setnx2 = cluster.setnx("money", "好人");
        System.out.println(setnx1);
        System.out.println(setnx2);
        /*String money = cluster.get("money");
        System.out.println(money);
        cluster.del("money");
        System.out.println(cluster.get("money"));*/
        cluster.close();
    }


}
