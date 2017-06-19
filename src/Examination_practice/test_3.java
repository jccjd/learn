package Examination_practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/19.
 */
public abstract class test_3 {
    String name;
    int age;
    public abstract void print();

}
class dog extends test_3{
    public dog(String string,int age){
        this.name=string;
        this.age=age;
    }

    public void print(){

        System.out.println(name+" "+age);
    }
}
class Main{
    public static void main(String[] args) {
        test_3 q1= new dog("eh",12);
        test_3 q2= new dog("eh",13);
        List<test_3> q= new ArrayList<>();
        q.add(q1);
        q.add(q2);
        for (int i = 0; i <2; i++) {
            q.get(i).print();
        }
    }

}
