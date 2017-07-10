package otherthree;

import java.util.IdentityHashMap;

/**
 * IndentityHashMap 键比较地址去重
 * Created by lenovo on 2017/7/10.
 */
public class IndentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String,String> map = new IdentityHashMap<>();
        //常量池中的“dd”
        map.put("dd","dd");
        map.put("dd","dd");
        System.out.println(""+map.size());
        map.put(new String("dd"),"dds");
        map.put(new String("dd"),"dds");
        System.out.println(""+map.size());

    }
}
