package factory.simplefactory;
/**
 *简单工厂类
 * @author 李龙
 * */
public class CarFactory {
    public static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new BYD();
        } else {
            return null;
        }

    }
}
