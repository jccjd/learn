package Examination_practice;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Person a1 = new Student("name","man",20,"student");
        Person a2 = new Student("name","man",30,"teacher");
        List<Person> people = new ArrayList<>();
        people.add(a1);
        people.add(a2);
        for (Person person : people) {
            person.printInfo();
            System.out.println("--------");
        }
    }
}
