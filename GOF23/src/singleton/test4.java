package singleton;

import javafx.beans.binding.ObjectExpression;

import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 *懒汉式单例模式(如何防止反射和反序列化漏洞)
 * */

public class test4 implements Serializable{

    private static test4 instance ;//类初始化时,不加载对象(延时加载,真正用的时候再创建)

    private test4() {
        /*防反射*/
        if (instance != null) {
            throw new RuntimeException();
        }
    }
    /*方法没有同步调用效率高*/
    public static synchronized test4 getInstance() {
        if (instance == null) {
            instance = new test4();
        }
        return instance;
    }
    /*防反序列化*/
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
