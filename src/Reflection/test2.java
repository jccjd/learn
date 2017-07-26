package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射API 获取类的信息(类的名字,方法,属性,构造器)
 */
public class test2 {
    public static void main(String[] args) {
        String path = "Reflection.User";
        try {
            Class cls = Class.forName(path);

            //获取类的名字
            System.out.println(cls.getName());
            System.out.println(cls.getSimpleName());

            System.out.println("========获得属性名========");
//            Field[] fields1 = cls.getFields();//只能获得public的field
            Field[] fields = cls.getDeclaredFields();//获得所有的field
            Field f = cls.getDeclaredField("uname");
            System.out.println(f);
            System.out.println(fields.length);

            for (Field field : fields) {
                System.out.println("field = [" + field + "]");
            }
            System.out.println("=======获取方法信息=======");
            Method[]  methods = cls.getDeclaredMethods();
            Method method1 = cls.getDeclaredMethod("getAge",null);
            Method method2 = cls.getDeclaredMethod("setAge", int.class);
            System.out.println(method1+" "+method2);
            for (Method method : methods) {
                System.out.println("method = [" + method + "]");
            }
            System.out.println("========获得构造器==============");
            Constructor[] constructor = cls.getDeclaredConstructors();
            Constructor c = cls.getDeclaredConstructor(null);
            Constructor c2 = cls.getDeclaredConstructor(String.class,int.class,int.class);
            System.out.println(c);
            System.out.println(c2);

            for (Constructor temp : constructor) {
                System.out.println("temp = [" + temp + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
