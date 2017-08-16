
/**
 * 测试内部类
 *
 * */
public class test1 {

    /*普通内部类(成员内部类)*/
    private class FiledInnerClass{

    }
    void sayHello(){

        /*方法内部类(局部内部类)*/
        class LocalClass{

        }
        /*匿名内部类*/
        Runnable runnable = new Runnable() {//两个作用:1.定义了匿名内部类的类体 2.创建了匿名内部类的对象
            @Override
            public void run() {

            }
        };

    }

    public static void main(String[] args) {

    }
}
