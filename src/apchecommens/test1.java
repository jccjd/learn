package apchecommens;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.EqualPredicate;

/**
 * 函数式编程 Predicate 断言
 * 封装条件或判别式 if-else的代替
 * Created by lenovo on 2017/7/12.
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println("相等判断");
//        Predicate<String> pre = new EqualPredicate<String>("bhd");
        Predicate<String> pre = EqualPredicate.equalPredicate("sd");
        boolean flage = pre.evaluate("d");
        System.out.println("\t"+flage);


    }
}
