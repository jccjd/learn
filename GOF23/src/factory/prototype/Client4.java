package factory.prototype;

/**
 * 测试普通new方式创建对象和clone方式创建对象的差异
 * 如果需要短时间创建大量对象,并且new的方式比较耗时,则可以考虑使用原型模式
 *
 * */

public class Client4 {

    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop laptop = new Laptop();
        }
        
        long end = System.currentTimeMillis();
        System.out.println("new 的方式创建耗时"+(end - start));
    }
    public static void testClone(int size) {
        long start = System.currentTimeMillis();
        Laptop laptop = new Laptop();

        for (int i = 0; i < size; i++) {
            try {
                Laptop t = (Laptop) laptop.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("clone 的方式创建耗时"+(end - start));
    }



    public static void main(String[] args) {
        testClone(1000);
        testNew(1000);
    }
}
class Laptop implements Cloneable{
    public Laptop() {
        try {
            Thread.sleep(1);//模拟创建对象耗时的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();//直接调用Object对象的clone方法
        return object;
    }
}