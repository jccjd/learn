package factory.prototype;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 *
 * 测试原型模式
 * */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep s1 = new Sheep("少理",  new Date(12334444L));
        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
