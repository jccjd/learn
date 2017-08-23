package factory.builder;

/**
 *
 * */

public class AirShip {
    private OrbitalNodule orbitalModule;
    private Engine engine;
    private EscapeTower escapeTower;//逃逸塔

    public OrbitalNodule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalNodule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
class OrbitalNodule {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrbitalNodule(String name) {

        this.name = name;
    }
}
class Engine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {

        this.name = name;
    }
}
class EscapeTower {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {

        this.name = name;
    }
}