package Examination_practice;

/**
 * Created by lenovo on 2017/6/19.
 */
public class test_4 extends Thread {
    public void run(){
        try {
            for (int i = 1; i <=10; i++) {
                Thread.sleep(100);
                System.out.println("this is thread: "+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Main1{
    public static void main(String[] args) {
        test_4 d1 = new test_4();
        test_4 d2 = new test_4();
        d1.start();
        d2.start();
    }

}