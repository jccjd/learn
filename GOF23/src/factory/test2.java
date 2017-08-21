package factory;
/**
 *  使用工厂模式
 *  */
public class test2 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪 ");

        c1.run();
        c2.run();
    }
}
