package factory.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("########");
        method.invoke(realstar,args);
        return null;
    }

    Star realstar;

    public StarHandler(Star realstar) {
        this.realstar = realstar;
    }
}
