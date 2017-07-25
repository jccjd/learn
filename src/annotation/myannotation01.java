package annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target
 * 元注解
 */

@Target(value = {ElementType.FIELD,ElementType.METHOD})
//@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface myannotation01 {

    String studentName() default "";
    int age() default 0;
    int id() default -1;
    String[] schools() default {""};
}
