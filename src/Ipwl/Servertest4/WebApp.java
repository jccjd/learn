package Ipwl.Servertest4;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class WebApp {
    private static ServerletContext context;
    static {
        try {
            //获取解析工厂
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //获取解析器
            SAXParser sax = factory.newSAXParser();
            //指定xml解析器
            WebHandler web = new WebHandler();
            sax.parse(Thread.currentThread().getContextClassLoader()
            .getResourceAsStream("Ipwl/Servertest4/web.xml"),web);

            //将list转成map
            context = new ServerletContext();
            Map<String, String> serverlet = context.getServerlet();
            //serverlet-name serverlet-class
            for (Entity entity : web.getEntityList()) {
                serverlet.put(entity.getName(),entity.getClz());
            }

            //url-pattern serverlet-name
            Map<String,String> mapping = context.getMapping();
            for (Mapping mapp : web.getMappingsList()) {
                List<String> urls = mapp.getUrlPattern();
                for (String url : urls) {
                    mapping.put(url, mapp.getName());
                }
            }


        } catch (Exception e) {
        }

    }
    public static Serverlet getServerlet(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
//        return context.getServerlet().get(context.getMapping().get(url));
        String name = context.getServerlet().get(context.getMapping().get(url));
        return (Serverlet)Class.forName(name).newInstance();//确保空构造存在
    }
}
