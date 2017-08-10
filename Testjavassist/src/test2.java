import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import java.util.Arrays;

/**
 * 测试javassist的API
 */
public class test2 {
    /*处理类的基本方法*/
    public static void test1() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("Emp");
        byte[] bytes = ctClass.toBytecode();
        System.out.println(Arrays.toString(bytes));
        System.out.println(ctClass.getName());
        System.out.println(ctClass.getSimpleName());
        System.out.println(ctClass.getSuperclass());
    }

    /*测试产生新方法*/
    public static void test2() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("Emp");



    }



    public static void main(String[] args) throws Exception {
        test1();
    }


}
