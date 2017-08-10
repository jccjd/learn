public class test1 {
    static {
        System.out.println("静态初始化test1");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        new A();
//        System.out.println(A.width);
//        new A();//只初始化一次
//        Class.forName("A");


//        System.out.println(A.width);//类的主动引用(一定会发生类的初始化)
        /*类的被动引用不会初始化*/
//        System.out.println(A.Max);//类的被动引用(不会发生类的初始化/在编译阶段已存入常量池中了)
//        A[] as = new A[10];
//        System.out.println(B.width);
    }

}
class B extends A {
    static {
        System.out.println("静态初始化B");
    }
}
class A extends A_Father{
    public static final int Max = 100;
    public static int width = 100;//静态变量/静态域 field
    static {
        System.out.println("静态初始化类A");
        width = 300;
    }

    public A() {
        System.out.println("创建A类的对象");
    }
}
class A_Father {
    static {
        System.out.println("静态初始化A_Father");
    }
}