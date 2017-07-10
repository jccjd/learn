package synchronizedtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections管理同步容器
 * synchronizedSet
 * synchronizedMap
 * synchronizedList
 * Created by lenovo on 2017/7/10.
 */
public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("s");
        list.add("aa");
        //list可以同步
        List<String> synList = Collections.synchronizedList(list);
        System.out.println("线程安全的List制作完成");

    }
}
