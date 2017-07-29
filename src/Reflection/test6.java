package Reflection;

import annotation.myField;
import annotation.myTable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 反射操作注解
 */

public class test6 {

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("annotation.mystudent");
            //获得类的所用有效注解
            Annotation[] annotations = cls.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

            //获得类的指定注解
            myTable st = (myTable) cls.getAnnotation(myTable.class);
            System.out.println(st.value());

            //get Class field annotation
            Field f = cls.getDeclaredField("name");
            myField myField = f.getDeclaredAnnotation(myField.class);
            System.out.println(myField.columnName()+"+"+myField.type()+"+"+myField.length());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
