package factory;
/**
 * 测试在没有工厂模式的情况
 * */
public class test1 {
    public static void main(String[] args) {
        Car c1 = new Audi();
        Car c2 = new BYD();
        c1.run();
            c2.run();
        }
}
