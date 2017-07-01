package polymorphism;

/**
 * Created by lenovo on 2017/7/1.
 */
public class Animal {
    public void voice() {
        System.out.println("动物叫声");
    }
}
class Cat extends Animal {
    public void voice() {
        System.out.println("喵喵喵");
    }
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal {
    public void voice() {
        System.out.println("汪汪汪");
    }
}