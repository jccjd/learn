package Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 通过反射看泛型
 */

public class test5 {
    private static void test1(Map<String,User> map, List<User> users) {
        System.out.println("test5.test1");
    }

    private Map<Integer,User> test2() {
        System.out.println("test5.tesst2");
    return null;
    }

    public static void main(String[] args) {
        try {
            Method m = test5.class.getDeclaredMethod("test1",Map.class, List.class);
            Type[] t = m.getGenericParameterTypes();
            for (Type type : t) {
                System.out.println("# = [" + type + "]");
                if (type instanceof ParameterizedType) {
                    Type[] genericTypes = ((ParameterizedType)type).getActualTypeArguments();
                    for (Type genericType : genericTypes) {
                        System.out.println("genericType = [" + genericType + "]");
                    }
                }
            }
        Method m2 = test5.class.getDeclaredMethod("test1",Map.class, List.class);
            Type[] t2 = m2.getGenericParameterTypes();
            for (Type type : t2) {
                System.out.println("# = [" + type + "]");
                if (type instanceof ParameterizedType) {
                    Type[] genericTypes = ((ParameterizedType)type).getActualTypeArguments();

                    for (Type genericType : genericTypes) {
                        System.out.println("genericType = [" + genericType + "]");
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
