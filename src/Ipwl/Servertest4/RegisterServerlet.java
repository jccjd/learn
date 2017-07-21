package Ipwl.Servertest4;

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
        response.println("你的用户名为:").println(request.getParameter("uname"));
        response.println("</body></html>");

    }
}
