package factory.factorymethod;

public class test1 {

    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BYDFactory().createCar();

        c1.run();
        c2.run();
    }

}
