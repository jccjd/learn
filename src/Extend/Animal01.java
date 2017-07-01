package Extend;

/**组合也可以实现复用，更灵活
 * 建模角度看有时是不符合实际的
 * 继承 : is-a
 * 组合 : has-a
 * Created by lenovo on 2017/7/1.
 */
public class Animal01 {
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
    public Animal01() {
        //super必须位于第一句
        super();
        System.out.println("创建一个动物");
    }

    public static void main(String[] args) {
        Bird01 b = new Bird01();
        b.run();
        b.animal01.eat();
    }

}
class Bird01 {
    Animal01 animal01 = new Animal01();
    public void run() {
        animal01.run();
        System.out.println("我是一只鸟");
    }
    public void oviparity() {
        System.out.println("卵生");
    }
    public Bird01() {
        super();
        System.out.println("建一个鸟对象");
    }
}

