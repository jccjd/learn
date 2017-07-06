package Collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Test02 {
    //一个map对象对应一行记录
public static void main(String[] args) {
    Map map = new HashMap();
    map.put("name","李");
    Map map1 = new HashMap();
    map1.put("name","李s");
    Map map2 = new HashMap();
    map2.put("name","李q");


    List<Map> list = new ArrayList<>();
    list.add(map);
    list.add(map1);
    list.add(map2);
    print(list);

}
public static void print(List<Map> list) {
    for (int i = 0; i < list.size(); i++) {
        Map temp = list.get(i);
        System.out.println(temp.get("name"));
    }
}
    
}
