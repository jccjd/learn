package Sort;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * Created by lenovo on 2017/7/9.
 */
public class NewsItemApp {

    public static void main(String[] args) {
        List<NewsItem> news =new ArrayList<NewsItem>();
        news.add(new NewsItem("百度AI上线了s", new Date(),100));
        news.add(new NewsItem("百度AI上线了", new Date(System.currentTimeMillis() - 1000*60*60),1000));
        news.add(new NewsItem("百度AI上线了", new Date(System.currentTimeMillis() - 1000*60*60),100));

        Collections.sort(news);
        System.out.println(""+news);
    }
}
