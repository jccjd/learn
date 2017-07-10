package otherthree;

import java.util.*;

/**
 * 容器只读设置
 *
 *  emptyxx 空的不可变集合
 *      emptylist
 *      emptymap
 *      emptyset
 *  singletonxx 一个元素不可变集合
 *      singletonlist
 *      singletonmap
 *      singletonset
 *  unmodifiablexx不可变容器
*       unmodifiablelist
*       unmodifiablemap
*       unmodifiableset
* Created by lenovo on 2017/7/10.
 */
public class test2 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"ss");
        map.put(2,"ss");
        map.put(3,"ss");
//        只读控制
        Map<Integer,String> map1 = Collections.unmodifiableMap(map);
//        一个元素的容器
        List list =Collections.singletonList("只能写在这里"+"sss");
        System.out.println(""+list.size()+list.get(0));

    }
    public static Set<String> oper(Set<String> set) {
        if (null == set) {
            return Collections.EMPTY_SET; //外部获取避免NullPointerException
        }
        //操作
        return set;
    }
}
