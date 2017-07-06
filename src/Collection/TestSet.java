package Collection;


import java.util.HashSet;
import java.util.Set;
/**测试Set的常用方法
 * Created by lenovo on 2017/7/5.
 */
public class TestSet {

    public static void main(String[] args) {

        Set set = new HashSet();
        java.lang.String c = "hhh";
////        if (/*c == new String("hhh")*/c.equals(new String("hhh"))) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        set.add(11);
        set.add(10);
        set.remove(10);
//        set.add(new String("aaaa"));
        System.out.println(""+set.size());
    }

}
