package test.guojian.com.androidutils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by Hello on 2017/9/22.
 */

public class HtmlUtils {

    /**
     * 字数是否符合要求
     *
     * @param string
     * @return
     */
    public static final boolean htmlLengthIsAble(String string) {

        int length = getLengthFromHtmlString(string) + getImgSizeFromHtmlString(string);

        return length >= 10 && length <= 10000 ? true : false;
    }


    private static final int getLengthFromHtmlString(String string) {
        if (null == string || string.trim().isEmpty()) {
            return 0;
        }

        return getContentFromHtmlString(string).length();
    }

    private static final String getContentFromHtmlString(String string) {
        Document document = Jsoup.parse(string, "utf-8");

        return document.body().text();
    }

    /**
     * @param string
     * @return
     */
    private static final int getImgSizeFromHtmlString(String string) {

        Document document = Jsoup.parse(string, "utf-8");

        Elements images = document.getElementsByTag("img");

        return images.size();
    }
}
