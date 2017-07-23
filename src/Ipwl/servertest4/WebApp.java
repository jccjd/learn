package Ipwl.servertest4;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/19.
 */
public class WebApp {
    private static ServerletContext context;

    static {
        try {
            //1.获取解析工厂
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //2.从解析工厂获取解析器
            SAXParser sax = factory.newSAXParser();
            //指定xml+处理器
            Webhandler web = new Webhandler();
            sax.parse(Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("Ipwl/servertest4/web.xml"), web);
            context = new ServerletContext();

            Map<String, String> servlet = context.getServerlet();
            for (Entity entity : web.getEntityList()) {
                servlet.put(entity.getName(), entity.getClz());
            }

            Map<String, String> mapping = context.getMapping();
            for (Mapping mapping1 : web.getMappingList()) {
                List<String> urls = mapping1.getUrlPattern();
                for (String url : urls) {
                    mapping.put(url, mapping1.getName());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Serverlet getServerlet(String url) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (url == null || (url = url.trim()).equals("")) {
            return null;
        }
//      根据字符串创建(完整路径)对象
//        return context.getServerlet().get(context.getMapping().get(url));
        String name = context.getServerlet().get(context.getMapping().get(url));

    }
}


