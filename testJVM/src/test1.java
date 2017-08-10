public class test1 {
    public static void main(String[] args) {
        new A();
        System.out.println(A.width);
    }

}
class A {

    public static int width = 100;//静态变量/静态域
    static {
        System.out.println("静态初始化类A");
        width = 300;
    }

    public A() {
        System.out.println("创建A类的对象");
    }
}
