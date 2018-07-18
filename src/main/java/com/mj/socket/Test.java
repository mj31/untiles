package com.mj.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {

    public static void main(String[] args) {
        String strUrl = "http://www.baidu.com" ;
        try {
            getUrlMessage(strUrl);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void getUrlMessage(String strUrl)throws Exception{
        try {
            URL url = new URL(strUrl);
            InputStream is = url.openStream();
            while (is.read() == -1){
                System.out.println(is.read());
            }
            InputStreamReader ireader = new InputStreamReader(is,"utf-8");
            BufferedReader br = new BufferedReader(ireader);
            String data = br.readLine();
            System.out.println(data);
            System.out.println("protocol==="+url.getProtocol());
            System.out.println("host==="+url.getHost());

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("抛出异常");
        }
    }
}
