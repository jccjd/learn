package generic;

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
    }

}
