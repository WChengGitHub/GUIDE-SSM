package com.guide.ssm.module.user.utils;

/**
 * Created by 泽彪 on 2016/12/6 0006.
 */

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * 花瓣网抽取器。<br>
 * 使用Selenium做页面动态渲染。<br>
 *
 * @author code4crafter@gmail.com <br>
 * Date: 13-7-26 <br>
 * Time: 下午4:08 <br>
 */

/**
 * 基于HtmlDriver抓取网页内容
 *
 * @author www.yshjava.cn
 */
public class HtmlDriverTest {

    public static void main(String[] s) {
        //目标网页
        String url = "http://www.yshjava.cn";
        HtmlUnitDriver driver = new HtmlUnitDriver();
        try {
            //禁用JS脚本功能
            driver.setJavascriptEnabled(true);
            //打开目标网页
            driver.get(url);
            //获取当前网页源码
            String html = driver.getPageSource();
            //打印网页源码
            System.out.println(html);
        } catch (Exception e) {
            //打印堆栈信息
            e.printStackTrace();
        } finally {
            try {
                //关闭并退出
                driver.close();
                driver.quit();
            } catch (Exception e) {
            }
        }
    }
}