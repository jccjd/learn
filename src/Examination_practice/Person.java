package Examination_practice;

public abstract class Person {
    String name;
    String xb;
    int age;
    public void printInfo(){}

}
class Student extends Person {
    String xs;
    public Student(String name, String xb, int age, String xs) {
        this.name = name;
        this.xb = xb;
        this.age = age;
        this.xs = xs;
    }

    @Override
    public void printInfo() {
        System.out.println("name: "+name+"\n"+"age: "+age+"\n"+"xb: "+xb+"\n"+"ls: "+xs);
    }
}
class Teacher extends Person {
    String ls;

    @Override
    public void printInfo() {
        System.out.println("name: "+name+"\n"+"age: "+age+"\n"+"xb: "+xb+"\n"+"ls: "+ ls);
    }
    public Teacher(String name, String xb, int age, String xs) {
        this.name = name;
        this.xb = xb;
        this.age = age;
        this.ls = xs;
    }
}

