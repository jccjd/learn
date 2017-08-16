package singleton;
/**
 * 测试饿汉式单例模式
 * */
public class test1 {
    /*线程天然安全*/
    private static test1 instance = new test1();//类初始化时立即加载对象(没有延时加载的优势)

    private test1() {
    }
    /*方法没有同步调用效率高*/
    public static test1 getInstance() {
        return instance;
    }

}
