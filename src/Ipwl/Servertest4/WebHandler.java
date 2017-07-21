package Ipwl.Servertest4;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebHandler extends DefaultHandler{
    private List<Entity> entityList;
    private List<Mapping> mappingsList;
    private Entity entity;
    private Mapping mapping;
    private String begginTag;
    private boolean isMap;
    @Override
    public void startDocument() throws SAXException {
        //文档解析开始
        entityList = new ArrayList<>();
        mappingsList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //开始元素
        if (null != qName) {
            begginTag = qName;
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
        if (null != begginTag) {
            String str = new String(ch,start,length);
            if (isMap) {
                if (begginTag.equals("server-name")) {
                    mapping.setName(str);
                } else if (begginTag.equals("url-pattern")) {
                    mapping.getUrlPattern().add(str);
                }
            } else {
                if (begginTag.equals("serverlet-name")) {
                    entity.setName(str);
                } else if (begginTag.equals("serverlet-class")) {
                    entity.setClz(str);
                }
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //结束元素
        if (qName.equals("server")) {
            entityList.add(entity);
        } else if (qName.equals("serverlet-mapping")) {
            mappingsList.add(mapping);
        }
        begginTag = null;
    }

    @Override
    public void endDocument() throws SAXException {
        //文档解析结束
    }

    public List<Entity> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public List<Mapping> getMappingsList() {
        return mappingsList;
    }

    public void setMappingsList(List<Mapping> mappingsList) {
        this.mappingsList = mappingsList;
    }

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        //获取解析工厂
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //获取解析器
        SAXParser sax = factory.newSAXParser();
        //指定xml+处理器
        WebHandler web = new WebHandler();

        sax.parse(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("Ipwl/servertest4/web.xml"),web);
        System.out.println(web.getEntityList());
    }
}
