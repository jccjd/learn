package Ipwl.Server;

/**
 * Created by lenovo on 2017/7/19.
 */
public class Serverlet {
    public void service(Request request, Response response) {
        response.println("<html><head><title>test</title></head>");
        response.println("<body>");
        response.println("欢迎:").println(request.getParameter("uname")).println("回来");
        response.println("</body></html>");

    }
}
