package otherthree;

import java.lang.ref.WeakReference;

/**引用分类：强 软 弱 虚
 * 强与弱引用
 *
 * Created by lenovo on 2017/7/9.
 */
public class RefDemo {
    public static void main(String[] args) {
        //字符串常量池
        String str = new String("hh hd h sb dds ");
        //弱引用管理对象
        WeakReference<String> wr = new WeakReference<String>(str);
        System.out.println("gc运行前"+wr.get());
        //断开引用
        str = null;
        //通知回收
        System.gc();
        System.runFinalization();
        //对象被回收
        System.out.println("gc运行前"+wr.get());
    }
    public static void testString() {
        //字符串常量池 共享（不能回收）
        String str = "hh hd h sb dds ";
        //弱引用管理对象
        WeakReference<String> wr = new WeakReference<String>(str);
        System.out.println("gc运行前"+wr.get());
        //断开引用
        str = null;
        //通知回收
        System.gc();
        System.runFinalization();
        System.out.println("gc运行前"+wr.get());

    }
}
