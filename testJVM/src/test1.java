public class test1 {
    static {
        System.out.println("静态初始化test1");
    }

    public static void main(String[] args) {
        new A();
        System.out.println(A.width);
    }

}
class A extends A_Father{

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