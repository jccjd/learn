package factory.factorymethod;

public class AudiFactory implements Carfactory{
    @Override
    public Car createCar() {
        return new Audi();
    }
}
