package com.mj.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.client.ConnectStringParser;

/**
 * Created by Administrator on 2018/7/22 0022.
 */
public class CreateSession implements Watcher {
    private static ZooKeeper zooKeeper ;

    public static void main1(String[] args)throws Exception {
        zooKeeper = new ZooKeeper("121.199.20.251:2181,121.199.20.251:2182,121.199.20.251:2183", 60000,new CreateSession()) ;
        System.out.println(zooKeeper.getState());
        Thread.sleep(1000);
    }

    @Override
    public void process(WatchedEvent event) {
        if(event.getState() == Event.KeeperState.SyncConnected){
           dosomeThing();
        }
        System.out.println("监听中");
    }

    private void dosomeThing() {
        System.out.println("开始做事情");
    }

    public static void main(String[] args) {
        String connectString = "121.199.20.251:2181,121.199.20.251:2182,121.199.20.251:2183" ;
        System.out.println(connectString.indexOf("2181"));
        ConnectStringParser connectStringParser = new ConnectStringParser(
                connectString);
        System.out.println(connectStringParser.getServerAddresses());
    }
}
