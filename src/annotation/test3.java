package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取信息
 */

public class test3 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("annotation.mystudent");
            Annotation[] annotations = cls.getAnnotations();

            for (Annotation a: annotations
                 ) {
                System.out.println(a);
            }
            //获得类的指定注解
           myTable tb = (myTable) cls.getAnnotation(myTable.class);
            System.out.println(tb.value());

            //获得类的属性注解
            Field field = cls.getDeclaredField("name");
            myField myField = field.getAnnotation(myField.class);
            System.out.println(myField.columnName()+"--"+myField.type()+"--"+myField.length()+"--"+0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
