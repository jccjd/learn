package factory.prototype;

import java.util.Date;

/**
 *
 * 测试原型模式(浅克隆)
 * */
public class Client3 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date =  new Date(12334444L);
        Sheep2 s1 = new Sheep2("少理",date);
        Sheep2 s2 = (Sheep2) s1.clone();//实现深复制.s2对象的birthday是一个新对象

        System.out.println(s1);
        System.out.println(s1.getBirthday());
        System.out.println(s1.getName());
        date.setTime(2222222233L);
        System.out.println(s2.getBirthday());
    }
}
