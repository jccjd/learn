import java.io.File;

/**
 * 测试简单的加密解密操作(取反)
 * */
public class test4 {
    public static void main(String[] args) throws ClassNotFoundException {
//        int a = 3;//00000011/11111111
//        System.out.println(Integer.toBinaryString(a^0xff));
//        FileSystemClassLoader loader = new FileSystemClassLoader("E:/dc/new");
//        Class<?> c = loader.loadClass("te");
//        System.out.println(c);
        DecrptClassLoder loder = new DecrptClassLoder("E:/dc/new");
        Class<?> c = loder.loadClass("te");
        System.out.println(c);

    }
}
