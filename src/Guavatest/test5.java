package Guavatest;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Set;

/**
 * 统计单词出现的次数
 * 1,HashMap分拣存储+面向对象思维-->判断
 * 2,Multiset:无序+可重复.count() 增加了可读性+操作简单
 * Created by lenovo on 2017/7/10.
 */
public class test5 {

    public static void main(String[] args) {
        String str = "this is a cat and that is a mice where is the food";
        //分割字符串
        String[] strArrays = str.split(" ");
        //存储到Multiset
        Multiset<String> set = HashMultiset.create();
        for (String temp : strArrays) {
            set.add(temp);
        }
        //获取所有的单词 set
        Set<String> lettes =set.elementSet();
        for (String temp : lettes) {
            System.out.println(temp+"-->"+ set.count(temp));
        }
    }
}
