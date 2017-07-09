package deepmap;

import java.util.*;

/*
 * Created by lenovo on 2017/7/8.
 */
public class MapDemo3 {

    public static void main(String[] args) {
        List<Student> students =exame();
        Map<String,ClassRoom> map = count(students);
        view(map);
    }

    public static void view(Map<String,ClassRoom> map) {
        Set<String> keys = map.keySet();
        Iterator<String> keysIt = keys.iterator();
        while (keysIt.hasNext()) {
            String no = keysIt.next();
            ClassRoom room = map.get(no);
            double total = room.getTotal();
            double avg = total/room.getStudentList().size();
            System.out.println(no+"-->"+total+"-->"+avg);
        }
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
        list.add(new Student("s2","s1", 132));
        list.add(new Student("s1","s2", 132));
        list.add(new Student("ss","ss", 132));
        return list;
    }

}
