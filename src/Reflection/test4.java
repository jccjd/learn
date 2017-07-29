package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射效率
 */

public class test4 {
    private static void test1() {
        User u =new User();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000L; i++) {
            u.getUname();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("(普通方法执行10亿次耗时) = [" + (endtime - starttime) + "]"+"ms");
    }

    private static void test2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User u = new User();
        Class cls = u.getClass();
        Method method = cls.getDeclaredMethod("getUname");
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000L; i++) {
            method.invoke(u);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("(反射方法调用执行10次亿耗时) = [" + (endtime - starttime) + "]"+"ms");
    }

    private static void test3() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        User u = new User();
        Class cls = u.getClass();
        Method method = cls.getDeclaredMethod("getUname");
        method.setAccessible(true);//跳过安全检查
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000L; i++) {
            method.invoke(u);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("(反射方法调用执行10亿次(跳过安全检查)耗时) = [" + (endtime - starttime) + "]"+"ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test1();
        test2();
        test3();
    }


}
