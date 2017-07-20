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


        Map<String, String> servlet =context.getServerlet();
        servlet.put("login", "Ipwl.servertest.LoginServerlet");
        servlet.put("reglister","Ipwl.servertest.RegisterServerlet");


    }
    public static Serverlet getServerlet(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
//      根据字符串创建(完整路径)对象
//        return context.getServerlet().get(context.getMapping().get(url));
        String name = context.getServerlet().get(context.getMapping().get(url));
        return (Serverlet) Class.forName(name).newInstance();
    }
}
