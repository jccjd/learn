package singleton;
/**
 * 测试懒汉式单例模式
 * */
public class test2 {

    private static test2 instance ;//类初始化时,不加载对象(延时加载,真正用的时候再创建)

    private test2() {
    }
    /*方法没有同步调用效率高*/
    public static synchronized test2 getInstance() {
        if (instance == null) {
            instance = new test2();
        }
        return instance;
    }

}
