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
/*对象是表示或封装一些数据.一个类被加载后,jvm会创建一个对该类的Class,类的整个结构信息会被放到对应的Class对象中*/
/*这个Class对象就像一面镜子,通过对象可以看到对应类的全部信息*/
            System.out.println(cls.hashCode());
            Class cls2 = Class.forName(path);//一个类只对应一个反射对象
            System.out.println(cls2.hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
