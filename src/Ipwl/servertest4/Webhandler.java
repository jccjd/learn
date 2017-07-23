package Ipwl.servertest4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Webhandler extends DefaultHandler {

    private List<Entity> entityList;
    private List<Mapping> mappingList;
    private Entity entity;
    private  Mapping mapping;

    private String beginteg;
    private boolean isMap;


    @Override
    public void startDocument() throws SAXException {
        //文档开始解析
        entityList = new ArrayList<>();
        mappingList = new ArrayList<>();

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //开始元素
        if (null !=qName) {
            beginteg = qName;
            if (qName.equals("serverlet")) {
                isMap = false;
                entity = new Entity();
            } else if (qName.equals("serverlet-mapping")) {
                isMap = true;
                mapping = new Mapping();
            }
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        //处理内容
        if (null != beginteg) {
            String str = new String(ch,start,length);
            if (isMap) {
                if (beginteg.equals("serverlet-name")) {
                    mapping.setName(str);
                } else if (beginteg.equals("url-pattern")) {
                    mapping.getUrlPattern().add(str);
                }
            } else {
                if (beginteg.equals("serverlet-name")) {
                    entity.setName(str);
                } else if (beginteg.equals("serverlet-class")) {
                    entity.setClz(str);
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //结束元素
        if (null != qName) {
            if (qName.equals("serverlet")) {
                entityList.add(entity);
            } else if (qName.equals("serverlet-mapping")) {
                mappingList.add(mapping);
            }
        }
        beginteg = null;

    }

    @Override
    public void endDocument() throws SAXException {
        //结束解析
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        //1.获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //2.从解析工厂获取解析器
        SAXParser sax = factory.newSAXParser();
        //指定xml+处理器
        Webhandler web = new Webhandler();
        sax.parse(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("Ipwl/servertest4/web.xml"),web);

    }

    public List<Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public List<Mapping> getMappingList() {
        return mappingList;
    }

    public void setMappingList(List<Mapping> mappingList) {
        this.mappingList = mappingList;
    }
}
