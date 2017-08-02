import javassist.*;

/**
 * 测试Javassist生成一个新类
 */

public class test1 {
    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.makeClass("Emp");

        /*创建属性*/
        CtField f1 = CtField.make("private int empno;",ctClass);
        CtField f2 = CtField.make("private String empname;",ctClass);
        ctClass.addField(f1);
        ctClass.addField(f2);

        /*创建方法*/
        CtMethod m1 = CtMethod.make("public int getEmpno() {return empno;}",ctClass);
        CtMethod m2 = CtMethod.make("public void setEmpno(int empno) {this.empno = empno;}",ctClass);
        ctClass.addMethod(m1);
        ctClass.addMethod(m2);
        /*创建构造器*/
        CtConstructor constructor = new CtConstructor(new CtClass[]{CtClass.intType,pool.get("java.lang.String")},ctClass);
        constructor.setBody("{this.empno = empno; this.empname = empname;}");
        ctClass.addConstructor(constructor);
        ctClass.writeFile("E:/dc");
        System.out.println("success");
    }
}
