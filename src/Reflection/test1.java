package Reflection;


/**
 *测试 Java.lang.Class对象的获取方式
 */
@SuppressWarnings("all")
public class test1 {
    public static void main(String[] args) {
        String path = "Reflection.User";

        try {
            Class cls = Class.forName(path);
            System.out.println(cls);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
