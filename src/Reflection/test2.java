package Reflection;

import java.lang.reflect.Field;

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
            //获得属性名
//            Field[] fields1 = cls.getFields();//只能获得public的field
            Field[] fields = cls.getDeclaredFields();//获得所有的field
            Field f = cls.getDeclaredField("uname");
            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println("field = [" + field + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
