
/**
 * 测试简单的加密解密操作(取反)
 * */
public class test4 {
    public static void main(String[] args) {
        int a = 3;//00000011/11111111
        System.out.println(Integer.toBinaryString(a^0xff));
    }
}
