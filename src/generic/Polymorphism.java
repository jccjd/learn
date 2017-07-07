package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 1，泛型没有多态
 * 2，泛型没有数组
 * Created by lenovo on 2017/7/7.
 */
public class Polymorphism {
    public static void main(String[] args) {
        //多态
        Fruit f = new Apple();

        //泛型没有多态
        //List<Fruit> list = new ArrayList<Apple>();
        // 泛型没有数组
        //
        //Fruit<String>[] arr = new Fruit<String>[10];
        //jdk1.7对泛型的简化操作
        //List<Fruit> list = new ArrayList<>();

    }
}
