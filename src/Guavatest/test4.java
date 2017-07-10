package Guavatest;

import com.google.common.collect.Sets;

import java.util.Set;

import static sun.java2d.cmm.ColorTransform.In;

/**集合的操作:交集,差集,并集;
 * Sets.intersction()
 * Sets.difference()
 * Sets.union()
 *
 * Created by lenovo on 2017/7/10.
 */
public class test4 {
    public static void main(String[] args) {
        Set<Integer> set1 = Sets.newHashSet(1,2,3,4,4,5,6);
        Set<Integer> set2 = Sets.newHashSet(3,4,5,6,6,76);

        //交集
        System.out.println(" 交集:");
        Sets.SetView<Integer> intersection = Sets.intersection(set1,set2);
        for (Integer temp : intersection) {
            System.out.print("\t"+temp);
        }
        //差集
        System.out.println("\n 差集:");
        Sets.SetView<Integer> diff = Sets.difference(set1,set2);
        for (Integer temp : diff) {
            System.out.print("\t"+temp);
        }
        //差集
        System.out.println("\n 并集:");
        Sets.SetView<Integer> union = Sets.union(set1,set2);
        for (Integer temp : union) {
            System.out.print("\t"+temp);
        }
    }

}
