package Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**gggfg
 * gffgbnhghgfhg
 * Created by lenovo on 2017/6/30.
 */
public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList<>();

       //ArrayList:底层实现是数组、 线程不安全， 所以 查询快，插入，修改，删除，慢；
      //Linkedlist:底层实现是链表，线程不安全，效率高，所以 查询慢，修改 删除插入 快；
     //Vector：线程安全，效率低；

        list.add("aaaa");
        list.add(new Date());
        list.add(new Dog());
        list.add(1234); //包装类的，自动装箱；，
        System.out.println(list.size());
        System.out.println(""+list.isEmpty());
        list.remove("aaaa");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(""+list.get(i));
        }
        List list1 = new ArrayList();
        list1.add("bbb");
        list1.add("ccc");

        list.add(list1);

        //跟顺序的操作

        String str = (String) list.get(0);
        System.out.println(""+str);
        list.set(1,"sd");
        list.remove(0);


    }
}
class Dog {

}
