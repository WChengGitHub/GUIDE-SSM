package com.guide.ssm.module.user.service.impl;

/**
 * Created by 泽彪 on 2016/12/6 0006.
 */
import com.guide.ssm.module.user.service.GetPageService;
import com.guide.ssm.module.user.utils.DownloadPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class GetPageServiceImpl implements GetPageService {


    @Override
    public String getIndexPage(String url) {
        Document doc = Jsoup.parse(DownloadPage.getContentFormUrl(url));
        System.out.println(doc);
        Elements table = doc.select("div#contest_overview > div.row");
        return table.html();
    }

    @Override
    public String getDetailPage(String url) {
        return null;
    }

    @Override
    public String login(String url) {
        return null;
    }
}
