package Guavatest;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**只读设置
 * Created by lenovo on 2017/7/10.
 */
public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("ss");
        list.add("ss");
        //对原有的List进行包装，相当于原有List的一个视图，快照，不够安全；
        List<String> readlist = Collections.unmodifiableList(list);
//        readlist.add("s");
        list.add("qw");//改变原有的List,视图也一起改变


        //对比查看初始化List guava对只读设置安全可靠,操作简单;
        List<String> immutableList = ImmutableList.of("s","ss","ss");
        immutableList.add("s");//java.lang.UnsupportedOperationException

    }

}
