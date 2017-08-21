package factory.simplefactory;
/**
 *简单工厂类
 * @author 李龙
 * */
public class CarFactory2 {
    public static Car createAudi(String type) {
        return new Audi();
    }
    public static Car createBYD(String type) {
        return new BYD();
    }
}
