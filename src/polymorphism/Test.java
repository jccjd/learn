package polymorphism;

/**多态是方法的多态
 *
 * Created by lenovo on 2017/7/1.
 */
public class Test {

    public static void testAnimalVoice(Animal c) {
        c.voice();

        if (c instanceof Cat) {
            ((Cat) c).catchMouse();
        }
    }
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        testAnimalVoice(dog);
        dog.voice();
        cat.voice();
        //强制转型
        Cat cat1 = (Cat)cat;
        cat1.catchMouse();

    }
}
