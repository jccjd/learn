package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by lenovo on 2017/5/7.
 */
public class linkedlist {
    public static void main(String[] args) {
        String a="A",b="B",c="C",text="text";
        LinkedList<String> list = new LinkedList<String>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println(list.getFirst());//获得并输出列表开头的对象
        list.addFirst(text);//向列表开头添加一个对象
        System.out.println(list.getFirst());
        list.removeFirst();//移除列表开头的对象
        System.out.println(list.getFirst());

    }


    /**
     * Created by lenovo on 2017/5/6.
     */
    public static class removeall {
        public static void main(String[] args) {
            String a = "A", b = "B", c = "C";
            Collection<String> list= new ArrayList<>();
            list.add(a);
            list.add(b);
            Collection<String>list2=new ArrayList<>();
            list2.add(b);
            list2.add(c);
            boolean isContains=list.retainAll(list2);
            System.out.println(isContains);
            Iterator<String> it=list.iterator();
            while (it.hasNext()){
                String str=it.next();
                System.out.println(str);
            }
        }
    }
}
