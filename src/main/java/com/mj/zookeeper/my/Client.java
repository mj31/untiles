package com.mj.zookeeper.my;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.collect.Maps;
import org.apache.zookeeper.*;

import java.util.Map;

public class Client {
    public static void main(String[] args)throws Exception {
        ZooKeeper zk =
                new ZooKeeper("121.199.20.251:2181,121.199.20.251:2182,121.199.20.251:2183", 60000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("开始监控");
            }
        });

        System.out.println("123".charAt(0)== '1');
        /*System.out.println(zk.getState());
        Map map = Maps.newHashMap();
        map.put("name","张三");
        map.put("age",20);
        zk.create("root", JSON.toJSONBytes(map, SerializerFeature.WriteMapNullValue), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(zk);*/
    }
}
