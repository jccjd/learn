package factory.factorymethod;

public class BYDFactory implements Carfactory{
    @Override
    public Car createCar() {
        return new BYD();
    }
}
