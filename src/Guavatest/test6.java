package Guavatest;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

/**分析查看教师教授的每门课程
 *Multimap:key-value key可以重复
 *
 * Created by lenovo on 2017/7/10.
 */
public class test6 {

    public static void main(String[] args) {
        Map<String,String> cours = new HashMap<String,String>();
        //加入测试数据
        cours.put("改革开放","邓小平");
        cours.put("三个代表","胡锦涛");
        cours.put("科学发展观","胡锦涛");
        cours.put("和谐社会","胡锦涛");
        cours.put("一带一路","习近平");

        //Multimap
        Multimap<String,String> teachers = ArrayListMultimap.create();

        //迭代器
        Iterator<Map.Entry<String,String>> it = cours.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry =it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            teachers.put(key,value);
        }
        //查看Multimap
        Set<String> keySet = teachers.keySet();

        for (String key : keySet) {
            Collection<String> col = teachers.get(key);
            System.out.println(key+"-->"+col);
        }

    }

}
