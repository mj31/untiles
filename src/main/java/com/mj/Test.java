package com.mj;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {
    public static void main1(String[] args)throws Exception {
        /*System.out.println(1<<4);
        System.out.println(hash(2));*/

        String url1 = "https://mpassport.dangdang.com/login.php?burl=http%3A%2F%2Fdangdu.dangdang.com%2Fu%2Flogin%2Fdo%3Furi%3D%2F";
        //String url2 = "http%3A%2F%2Fdangdu.dangdang.com%2Fu%2Flogin%2Fdo%3Furi%3D%2Fbook%2F87515.html";
        String url2 = "http%3A//dangdu.dangdang.com%2Fu%2Flogin%2Fdo%3Furi%3D%2Fbook%2F87515.html";
        System.out.println(URLDecoder.decode(url2,"utf-8"));
    }



    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
