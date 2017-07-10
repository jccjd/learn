package Guavatest;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/** 函数式编程
 *   1.Predicate
 *   2.Function
 *
 * 工具Collections2.filter() 过滤器
 * Collections2.transfer()转换器
 * Function.compose()组合式函数编程
 *
 * Created by lenovo on 2017/7/10.
 */
public class text2 {
    public static void main(String[] args) {
        //组合式函数编程
        /*确保容器中的字符串长度不超过5,超过进行截取,后全部大写*/

        List<String> list = Lists.newArrayList("ok","thanks","goodness");
        //确保容器中字符串的长度不超过5,超过进行截取
        Function<String, String> f1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.length()>5?s.substring(0,5):s;
            }
        };
        //转成大写
        Function<String,String> f2 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
    }
    public static void test() {
        //类型转换
        Set<Long> timeSet = Sets.newHashSet();
        timeSet.add(1000000L);
        timeSet.add(9999999999999999L);
        timeSet.add(2000000000000L);
        Collection<String> timeStrCol = Collections2.transform(timeSet, new Function<Long, String>() {
            @Override
            public String apply(Long aLong) {
//                业务逻辑
                return new SimpleDateFormat("yyyy-MM-dd").format(aLong);
            }
        });
        for (String temp : timeStrCol) {
            System.out.println(""+temp);
        }
    }


}
