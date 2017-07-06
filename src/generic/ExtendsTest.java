package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * extends: 泛型的上限 <= 即子类或自身
 *1,一般用于限制操作
 * 2，不能使用在添加数据上面，一般都是读取操作
 * 3，规则
 * List<Fruit> --> List<? extends Fruit>
 * List<Apple> --> List<? extends Fruit>
 * List<? extends Apple> --> List<? extends Fruit>
 * 不能存放
 * List<?> == List <? extends Object>
 * Created by lenovo on 2017/7/6.
 */
public class ExtendsTest {

    public static void main(String[] args) {
        Test<Fruit> t1 = new Test<Fruit>();
        Test<Apple> t2= new Test<Apple>();
        Test<Pear> t3 = new Test<Pear>();

        //调用方法
        List<? extends Fruit> list1 = new ArrayList<Fruit>();
        TEst(list1);
        List<Fruit> list2 = new ArrayList<Fruit>();
        TEst(list2);
        List<Apple> list3 = new ArrayList<Apple>();
        TEst(list3);
        List<? extends Apple> list4 = new ArrayList<FushiApple>();
        TEst(list4);
        // -->为什么不行 因为? 等同于？extends Object 而Object 显然要大于Fruit这个上限
//        List<?> list5 = new ArrayList<Object>();==List<? extends Object> = new ArrayList<>();
//        TEst(list5);

        List<FushiApple> app = new ArrayList<FushiApple>();
        TEst(app);
    }
    //? extends Fruit
    static void TEst(List<? extends Fruit> list) {
        /*
        list.add(new Apple());
        list.add(new FushiApple());
        list.add(new Pear());
        */
        list.add(null);
    }
    //泛型类
    static class Test<T extends Fruit> {

    }
}
