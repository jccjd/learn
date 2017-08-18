package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化破解单例模式
 * */

public class Client2 {

    public static void main(String[] args) throws Exception {
        test4 s1 = test4.getInstance();
        test4 s2 = test4.getInstance();
        System.out.println(s1);
        System.out.println(s2);


        /*通过反射的方式直接调用私有构造器*/
        Class<test4> cls = (Class<test4>) Class.forName("singleton.test4");
        Constructor<test4> c = cls.getDeclaredConstructor(null);
        c.setAccessible(true);
//        test4 s3 = c.newInstance();
//        test4 s4 = c.newInstance();
//
//        System.out.println(s3);
//        System.out.println(s4);

        /*通过反序列化构造多个对象*/
        FileOutputStream fos = new FileOutputStream("d:a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:a.txt"));
        test4 s3 = (test4) ois.readObject();
        System.out.println(s3);


    }
}
