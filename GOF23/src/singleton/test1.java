package singleton;
/**
 * 测试饿汉式单例模式
 * */
public class test1 {
    private static test1 instance = new test1();
    private test1() {

    }
}
