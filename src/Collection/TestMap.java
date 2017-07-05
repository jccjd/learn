package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/5.
 */
public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("kk",new Wife("mm"));
        map.put("jj",new Wife("ll"));
        map.put("ww",new Wife("nn"));

        map.remove("kk");
        System.out.println(""+map.containsKey("kk"));
//        Wife w = (Wife) map.get("kk");
//        System.out.println(""+w.name);
    }
}
class Wife{
    String name;
    public Wife(String name){
        this.name = name;
    }
}
