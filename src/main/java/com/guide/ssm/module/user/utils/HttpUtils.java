package com.guide.ssm.module.user.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by zaber on 2016/12/6.
 */

public class HttpUtils {


    public static void main(String[] args) {
        String url = "http://arena.acmclub.com/contest.php?cid=100001072";
        Runtime runtime = Runtime.getRuntime();

        Process p = null;
        try {
            p = runtime.exec("D:/phantomjs.exe D:/1.js " + url);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            StringBuffer sbf = new StringBuffer();
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                sbf.append(tmp);
            }
            System.out.println(sbf.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}