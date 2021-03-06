package factory.prototype;

import java.util.Date;

/**
 *
 * 测试原型模式(浅克隆)
 * */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date =  new Date(12334444L);
        Sheep s1 = new Sheep("少理",date);
        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());
        date.setTime(222223343L);
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
