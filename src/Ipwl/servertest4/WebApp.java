package Ipwl.servertest4;

import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class WebApp {
    private static ServerletContext context;

    static {
        context = new ServerletContext();
        Map<String, String> mapping = context.getMapping();
        mapping.put("/login", "login");
        mapping.put("/log", "login");
        mapping.put("/reg", "reglister");

        Map<String, String> serverlet = context.getServerlet();
        serverlet.put("login", "Ipwl.servertest4.LoginServerlet");
        serverlet.put("reglister", "Ipwl.servertest4.RegiseterServerlet");
    }

    public static Serverlet getServerlet(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (url == null || (url = url.trim()).equals("")) {
            return null;
        }
        String name = context.getServerlet().get(context.getMapping().get(url));
        return (Serverlet)Class.forName(name).newInstance();
    }
}
