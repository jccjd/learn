package generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**泛型嵌套 --> 由外到内拆分
 * Created by lenovo on 2017/7/6.
 */
public class StudentApp {
    public static void main(String[] args) {
        Student<String> stu = new Student<String>();
        stu.setScore("100");
        System.out.println(""+stu.getScore());

        //泛型嵌套
        Bjsxt<Student<String>> bjsxt = new Bjsxt<>();
        bjsxt.setStudent(stu);

        stu = bjsxt.getStudent();
        String score = stu.getScore();
        System.out.println(""+score);

        //HashMap遍历方式 使用了泛型的嵌套
        Map<String, String> map = new HashMap<>();
        map.put("h1",new String("dsd"));
        map.put("h2",new String("dsd22"));
        map.put("h2",new String("dsd请问"));

        Set<Entry<String,String>> entrySet = map.entrySet();
        for (Entry<String,String> entry:entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }

}
