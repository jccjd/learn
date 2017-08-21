package factory.abstractFcatory;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
    Seat createSeat();
}
