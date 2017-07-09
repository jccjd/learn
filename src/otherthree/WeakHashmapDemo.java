package otherthree;

import java.util.WeakHashMap;

/**
 * WeakHashMap 键为弱类型，gc运行立即回收
 * Created by lenovo on 2017/7/9.
 */
public class WeakHashmapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,String> map = new WeakHashMap<>();
        //测试数据
        //常量池对象 不会被回收
        map.put("ss","ww");
        map.put("sws","ww");
        //gc运行已被回收
        map.put(new String("dd"),"d");
        map.put(new String("ds"),"d");
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println(""+map.size());



    }
}
