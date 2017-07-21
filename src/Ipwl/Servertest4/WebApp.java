package Ipwl.Servertest4;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
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
            WebHandler
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        //

    }
    public static Serverlet getServerlet(String url) {
        if (url == null || (url=url.trim()).equals("")){
            return null;
        }
        return context.getServerlet().get(context.getMapping().get(url));
    }
}
