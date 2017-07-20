package Ipwl.servertest;

import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class WebApp {
    private static ServerletContext context;
    static {
        context = new ServerletContext();
        Map<String,String> mapping = context.getMapping();
        mapping.put("/login","login");
        mapping.put("/log","login");
        mapping.put("/reg","reglister");

        Map<String,String> serverlet = context.getServerlet();
        serverlet.put("login","package Ipwl.servertest.LoginServerlet");
        serverlet.put("reglister","package Ipwl.servertest.RegisterServerlet");

    }
    public static Serverlet getServerlet(String url) {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
        return context.getServerlet().get(context.getMapping().get(url));
    }
}
