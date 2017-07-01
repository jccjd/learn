package Extend;

/**
 * Created by lenovo on 2017/7/1.
 */
public class Animal /*extend Object*/ {
    String eye;

    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("zzzzzz");
    }
    public Animal() {
        //super必须位于第一句
        super();
        System.out.println("创建一个动物");
    }

}
class Bird extends Animal {
    @Override
    public void run() {
        super.run();
        System.out.println("我是一只鸟");
    }
    public void oviparity() {
        System.out.println("卵生");
    }
    public Bird() {
        super();
        System.out.println("建一个鸟对象");
    }
}
