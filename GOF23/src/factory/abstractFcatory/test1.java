package factory.abstractFcatory;
/**
 *
 * */
public class test1 {

    public static void main(String[] args) {

        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.start();
        engine.run();
    }
}
