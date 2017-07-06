package Collection;



import java.util.HashMap;

/**
 * Created by lenovo on 2017/7/6.
 */
public class SxthashSet {

    HashMap map;

    public static final Object PRESENT = new Object();

    public int size() {
        return map.size();
    }
    public SxthashSet() {
        map = new HashMap();
    }

    public void add(Object o) {
        map.put(o,PRESENT);//set的不可重复就是利用了map里面键值对象的不可重复
    }

    public static void main(String[] args) {
        SxthashSet set = new SxthashSet();
        set.add(22);
        set.add(new String("ww"));
        System.out.println(""+set.size());
    }

}



