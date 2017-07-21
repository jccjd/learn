package Ipwl.ServerFinal;

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

        Map<String,Serverlet> serverlet = context.getServerlet();
        serverlet.put("login",new LoginServerlet());
        serverlet.put("reglister",new RegisterServerlet());

    }
    public static Serverlet getServerlet(String url) {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
        return context.getServerlet().get(context.getMapping().get(url));
    }
}
