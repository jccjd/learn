package singleton;
/**
 * 静态内部类实现单例模式
 * (兼备了并发高效和延迟加载的优势)
 * */
public class test3 {

    private static class SingletonClassInstance {
        private static final test3 instance = new test3();
    }

    public static test3 getInstance() {
        return SingletonClassInstance.instance;
    }

    private test3() {}
}
