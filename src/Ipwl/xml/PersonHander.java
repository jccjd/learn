package Ipwl.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import sun.dc.pr.PRError;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonHander extends DefaultHandler {
    private List<Person> persons;
    private Person person;
    private String tag;

    @Override
    public void startDocument() throws SAXException {
        System.out.printf("文档处理开始");
        persons = new ArrayList<>();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("文档处理结束");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("开始一个元素"+qName);
        if (null != qName) {
            tag = qName;
        }
        if (null != qName && qName.equals("person")) {
            person = new Person();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("person")) {
            this.persons.add(person);
        }
        tag = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String str = new String(ch,start,length);
       if (null != tag && tag.equals("name")) {
//           System.out.print(new String(ch,start,length));
           person.setName(str);
       } else if (null != tag && tag.equals("age")) {
            Integer age = Integer.valueOf(str);
            person.setAge(age);
        }
    }
}
