package Thread;

/**
 * Created by lenovo on 2017/6/1.
 */
public class myRunable implements Runnable {
    public void run(){
        int i = 15 ;
        while (i-->=1){
            try {
                System.out.print(" * ");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread= new Thread((Runnable) new myRunable(),"Thread1");
        thread.start();

    }
}
