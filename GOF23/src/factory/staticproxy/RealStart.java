package factory.staticproxy;

public class RealStart implements Star{

    @Override
    public void confer() {
        System.out.println("RealStart.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStart.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStart.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStart.sing()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStart.collectMoney()");
    }
}
