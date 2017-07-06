package generic;

import java.util.ArrayList;
import java.util.List;

/**Super : 泛型的上限 >= 即父类或自身 往上
 *1,一般用于上限操作
 * 2.能用来添加数据一般是子类对象，不能添加父类对象
 * * 3，规则
 * List<Fruit> --> List<? super Apple>
 * List<Apple> --> List<? super Apple>
 * List<? super Fruit> ==> List <? super Apple>
 * 不能存放
 * List<? super FushiApple> ==> List <? super Apple>

 * Created by lenovo on 2017/7/6.
 */
public class SuperText {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>();
        test(apples);
        List<Fruit>  fruits= new ArrayList<>();
        test(fruits);
        List<Object> objects = new ArrayList<Object>();
        test(objects);

        //规则
        List<? super Apple> list = new ArrayList<Apple>();
        test(list);
        List<? super Fruit> list1 = new ArrayList<Object>();
        test(list1);
//        List<? super FushiApple> list2 = new ArrayList<Object>();
//        test(list2);
    }

    public static void test(List<? super Apple> list) {

    }
}
