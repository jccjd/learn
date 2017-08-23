package factory.builder;

public class MyAirShipBuilder implements AirShipBuilder{

    public static void main(String[] args) {

    }

    @Override
    public Engine builderengine() {
        System.out.println("Engine");
        return new Engine("Engine");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("OrbitalModule");
        return new OrbitalModule("OrbitalModule");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("EscapeTower");
        return new EscapeTower("EscapeTower");
    }
}
