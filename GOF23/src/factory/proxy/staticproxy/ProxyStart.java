package factory.proxy.staticproxy;

public class ProxyStart implements Star {

    private Star star;

    public ProxyStart(Star start) {
        this.star = start;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStart.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStart.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStart.bookTicket()");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStart.collectMoney()");
    }
}
