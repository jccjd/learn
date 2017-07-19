package Ipwl.servertest;

/**抽象父类
 * Created by lenovo on 2017/7/19.
 */
public abstract class Serverlet {
    public void service(Request request, Response response) throws Exception{
        this.doGet(request,response);
        this.doPost(request,response);
    }
    public abstract void doGet(Request request, Response response) throws Exception;
    public abstract void doPost(Request request, Response response) throws Exception;
}
