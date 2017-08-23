package factory.builder;

public class MyAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine =  builder.builderengine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();
       /*组装*/
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalModule(orbitalModule);
        return ship;
    }
}
