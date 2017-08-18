package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 *测试五种创建单列模式的效率
 *
 * */

public class Client3 {
    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch count = new CountDownLatch(threadNum);
        for (int i = 0; i < 10; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100000; i++) {
//                        Object o = test3.getInstance();
                        Object o = test5.INSTANCE;
                    }
                    count.countDown();
                }
            }).start();

        }
        count.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时"+(end - start));

    }

}
