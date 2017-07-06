package generic;

/**泛型嵌套
 * Created by lenovo on 2017/7/6.
 */
public class StudentApp {
    public static void main(String[] args) {
        Student<String> stu = new Student<String>();
        stu.setScore("100");
        System.out.println(""+stu.getScore());
    }

}
