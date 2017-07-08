package deepmap;

/**
 * Created by lenovo on 2017/7/8.
 */
public class Student {

    private String name;
    private String no;
    private double score;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, String no, double score) {
        this.name = name;
        this.no = no;
        this.score = score;

    }

    public Student(String name) {

        this.name = name;
    }
}
