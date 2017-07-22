package Ipwl.servertest4;

import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class WebApp {
    private static ServerletContext context;
    static {




    public static Serverlet getServerlet(String url) {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
        return context.getServerlet().get(context.getMapping().get(url));
    }
}
