package Thread;

/**
 * Created by lenovo on 2017/7/14.
 */
public class ProgrammerApp {
    public static void main(String[] args) {
        Programmer pro = new Programmer();
        Thread poxy = new Thread(pro);
        poxy.start();
        for (int i = 0; i < 10; i++) {

            System.out.println("一边聊QQ");
        }
    }
}
