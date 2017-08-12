
/**
 * 测试自定义的FileSystemClassLoader
 * */
public class test3 {
    public static void main(String[] args) throws ClassNotFoundException {
        FileSystemClassLoader loader = new FileSystemClassLoader("E:/dc");
        FileSystemClassLoader loader2 = new FileSystemClassLoader("E:/dc");
        Class<?> c = loader.loadClass("te");
        Class<?> c2 = loader.loadClass("te");
        Class<?> c3 = loader2.loadClass("te");
        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }

}
