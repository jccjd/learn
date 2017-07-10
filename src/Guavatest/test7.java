package Guavatest;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**HashMap　键唯一　值可以重复
 *Bimap:双向MAp(Bidirectional Map) 键与值都不能重复（unique -valued map）
 *
 * Created by lenovo on 2017/7/10.
 */
public class test7 {

    public static void main(String[] args) {
        BiMap<String,String> biMap = HashBiMap.create();
        biMap.put("bjsxt", "bjsxt@sina.com");
        biMap.put("good","good@qq.com");
        //通过邮箱找用户
        String user = biMap.inverse().get("good@qq.com");
        System.out.println(""+user);
        System.out.println(biMap.inverse().inverse() == biMap);

    }
}
