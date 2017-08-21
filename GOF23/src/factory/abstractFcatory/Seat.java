package factory.abstractFcatory;

public interface Seat {
    void massage();
}
class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩");
    }
}
class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能自动按摩");
    }
}
