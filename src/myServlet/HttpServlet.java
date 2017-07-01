package myServlet;

/**
 * Created by lenovo on 2017/7/1.
 */
public class HttpServlet {
    public void service() {
        System.out.println("HttpServlet.service()");
        doGet();
    }

    public void doGet() {
        System.out.println("HttpServlet.doGet()");
    }
}
