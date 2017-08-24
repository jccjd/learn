package factory.proxy.dynamicproxy;

import factory.proxy.staticproxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class StarHandler implements InvocationHandler{
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(realStar,args);

        return null;
    }
}
