package iterator;

import java.util.*;

/**
 * Created by lenovo on 2017/7/6.
 */
public class Test01 {


    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("22");
        list.add("qq");
        list.add("ass");


//        通过索引遍历List
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(""+list.get(i));
//        }

//        通过迭代器遍历List
        for (Iterator iterator2 = list.iterator();iterator2.hasNext();) {
            String str = (String) iterator2.next();
//            System.out.println(""+str);
            iterator2.remove();
        }
        System.out.println(""+list.size());


        Set set =new HashSet();
        set.add("ll1");
        set.add("ll2");
        set.add("ll3");
        //通过迭代器遍历Set
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String str = (String) iterator.next();
//            System.out.println(""+str);
//        }
        for (Iterator iterator = set.iterator();iterator.hasNext();) {
         String str = (String) iterator.next();
             System.out.println(""+str);
//            iterator.remove();
        }

    }

}
