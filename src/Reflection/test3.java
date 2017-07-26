package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API动态的操作:个构造器,方法,属性;
 */
public class test3 {
    public static void main(String[] args) {
        String path = "Reflection.User";
        try {
            Class<User> cls = (Class<User>) Class.forName(path);

            //通过反射ApI调用构造方法:构造对象
            User user = cls.newInstance();
            System.out.println(user);
            Constructor<User> c = cls.getDeclaredConstructor(String.class, int.class, int.class);
            User user1 = c.newInstance("ff",22,22);
            System.out.println(user1.getUname());
            //通过反射API调用方法
            User user2 = cls.newInstance();
            Method method = cls.getDeclaredMethod("setUname", String.class);
            method.invoke(user2,"李龙");
            System.out.println(user2.getUname());
            //通过API操作属性
            User user3 = cls.newInstance();
            Field field = cls.getDeclaredField("uname");
            field.setAccessible(true);
            field.set(user3,"李龙3");
            System.out.println(user3.getUname());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
