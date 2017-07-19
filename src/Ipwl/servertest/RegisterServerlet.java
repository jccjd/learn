package Ipwl.servertest;

/**
 * Created by lenovo on 2017/7/19.
 */
public class RegisterServerlet extends Serverlet {
    @Override
    public void doGet(Request request, Response response) throws Exception {

    }

    @Override
    public void doPost(Request request, Response response) throws Exception {
        response.println("<html><head><title>test</title></head>");
        response.println("<body>");
        response.println("欢迎:").println(request.getParameter("uname")).println("回来");
        response.println("</body></html>");

    }
}
