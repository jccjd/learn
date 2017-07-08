package deepmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 分拣存储： 解决一对多的关系 1 -> N;
 * 统计单词出现的次数
 * this is a cat and that is a mice and where is the food
 *
 *
 * 思路：
 *      1.分割字符串
 *      2.分拣存储
 *      3.按要求查看单词出现的次数
 * 加入面向对象
 * Created by lenovo on 2017/7/7.
 */
public class MapDemo2 {

    public static void main(String[] args) {
        //分割字符串
        String arr[] = "this is a cat and that is a mice and where is the food".split(" ");
        //分拣存储
        Map<String,Letter> map = new HashMap<>();
        for (String key:arr) {
            //第一次查看是否存在袋子
            if (!map.containsKey(key)) {
                map.put(key,new Letter(key));
            }
            Letter value = map.get(key);
            value.setCount(value.getCount()+1);
        }
        for (String key:map.keySet()) {
            Letter value = map.get(key);
            System.out.println(key+"-->"+value.getCount());
        }
    }
}