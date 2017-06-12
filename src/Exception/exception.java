package Exception;

/**
 * 空指针异常
 * Created by lenovo on 2017/6/4.
 */
public class exception {
    public static void main(String[] args) {
        computer c=null;
        c.start();//对象是null，但调用了该对象的方法
        /**
         * 如果不可避免要调用需要这样做：
         * if(c!=null){
         *          c.start();
         *    }
         */
        try {
            Thread.sleep(300);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("over");
        }
    }

}
class  computer{
    void start(){
        System.out.println("start");
    }
}
