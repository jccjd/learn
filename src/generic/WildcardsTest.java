package generic;

import java.util.ArrayList;
import java.util.List;

/**? ==> 通配符，类型不确定，用于声明变量上或者形参上
 * 不能用在
 * 1，创建对象
 * 2，创建泛型接口，泛型类泛型方法
 *
 * Created by lenovo on 2017/7/6.
 */
public class WildcardsTest {
    public static void main(String[] args) {

        List<?> list = new ArrayList<Integer>();
        list = new ArrayList<String>();
        list = new ArrayList<Object>();
        test(list);

    }

    public static void test(List<?> list) {

    }
}
