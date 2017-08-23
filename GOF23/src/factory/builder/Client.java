package factory.builder;

public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new MyAirShipDirector(new MyAirShipBuilder());
        AirShip ship = director.directAirShip();
        System.out.println(ship.getEngine().getName());
        ship.launch();
    }
}
