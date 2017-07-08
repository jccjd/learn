package deepmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/7/8.
 */
public class ClassRoom {
    private String no;
    private List<Student> studentList;
    private double total;

    public ClassRoom() {
        studentList = new ArrayList<>();
    }

    public ClassRoom(String no) {
        this();
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ClassRoom(String no, List<Student> studentListlist, double total) {

        this.no = no;
        this.studentList = studentListlist;
        this.total = total;
    }
}
