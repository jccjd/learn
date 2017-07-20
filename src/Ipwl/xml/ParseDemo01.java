package Ipwl.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class ParseDemo01 {
    /**
     * @param args
     * @throws SAXException
    * */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //1.获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.从解析工厂获取解析器
        SAXParser parser = factory.newSAXParser();
        //3.加载文档 Document 注册处理器
        //4.编写处理器
        PersonHander handler = new PersonHander();
        parser.parse(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("Ipwl/xml/person.xml"),handler);
        List<Person> persons = handler.getPersons();
        for (Person p : persons) {
            System.out.println(p.getName()+"-->"+p.getAge());
        }
    }
}
