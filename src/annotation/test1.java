package annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * 注解
 */

@SuppressWarnings("all")
public class test1 {

    @Override
    public String toString() {
        return "";
    }

    //不建议使用
    @Deprecated
    public static void test001() {
        System.out.printf("test");
    }
    //

    public void test002() {
        List list = new ArrayList();

    }

    public static void main(String[] args) {
        test001();
    }
}
