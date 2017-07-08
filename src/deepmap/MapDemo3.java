package deepmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/8.
 */
public class MapDemo3 {

    public static void main(String[] args) {

    }

    public static Map<String,ClassRoom> count(List<Student> list) {
            Map<String,ClassRoom> map = new HashMap<>();
            for (Student student: list) {
                String no = student.getNo();
                double score = student.getScore();
                ClassRoom classRoom = map.get(no);
                if (classRoom == null) {
                    classRoom = new ClassRoom(no);
                    map.put(no,classRoom);
                }
                classRoom.getStudentList().add(student);
                classRoom.setTotal(classRoom.getTotal()+score);
            }

            return map;

    }

    public static List<Student> exame() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("ss","ss", 132));
        list.add(new Student("ss","s2", 132));
        list.add(new Student("ss","ss", 132));
        return list;
    }

}
