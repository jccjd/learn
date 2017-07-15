package Thread;

/**
 * 使用Runnable 创建线程
 * 1.避免单继承的局限性
 * 2.便于使用共享资源
 * Created by lenovo on 2017/7/14.
 */
public class Programmer implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("一边敲代码");

        }
    }
}
