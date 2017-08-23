package factory.prototype;

import java.io.*;
import java.util.Date;

/**
 *
 * 测试原型模式(深克隆,使用序列化和反序列化的方式实现深复制)
 * */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException,Exception {

        Date date =  new Date(12334444L);
        Sheep s1 = new Sheep("少理",date);
        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());

     //   Sheep2 s2 = (Sheep2) s1.clone();//实现深复制.s2对象的birthday是一个新对象
        /*使用序列化和反序列化的方式实现*/
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep)ois.readObject();//克隆好的对象



        date.setTime(2222222233L);

        System.out.println(s2.getBirthday());

    }
}
