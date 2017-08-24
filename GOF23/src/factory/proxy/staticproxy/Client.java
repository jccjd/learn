package factory.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        Star real = new RealStart();
        Star proxy = new ProxyStart(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
    }
}
