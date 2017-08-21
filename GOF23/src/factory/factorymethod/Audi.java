package factory.factorymethod;

/**
 * 简单工厂
* */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("Audi run");
    }
}
