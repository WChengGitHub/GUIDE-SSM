package com.guide.ssm.module.user.utils;

/**
 * Created by zaber on 2016/12/6.
 */

import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.text.ParseException;

public class HtmlUnitDemo {

    public static void main(String[] args) throws ParseException {

        WebClient webClient = new WebClient();
        webClient.getOptions().setJavaScriptEnabled(true); //启用JS解释器，默认为true
        webClient.getOptions().setCssEnabled(false); //禁用css支持
        webClient.getOptions().setThrowExceptionOnScriptError(false); //js运行错误时，是否抛出异常
        webClient.getOptions().setTimeout(2000);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        webClient.getOptions().setUseInsecureSSL(true);
        try {
            HtmlPage page =(HtmlPage)webClient.getPage("http://vjudge.net/contest/128714#overview");
            System.out.println(page.asXml());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}