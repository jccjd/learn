package factory.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Star realstar = new RealStart();
        StarHandler handler = new StarHandler(realstar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        proxy.bookTicket();
        proxy.sing();
    }
}
