package Ipwl.servertest;

/**
 * Created by lenovo on 2017/7/19.
 */
public class LoginServerlet extends Serverlet{

    @Override
    public void doGet(Request request, Response response) throws Exception {
        String name = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        if (login(name, pwd)) {
            response.println("登录成功");
        } else {
            response.println("登录失败");

        }

    }

    public boolean login(String name, String pwd) {

        return name.equals("ll") && pwd.equals("123456");
    }
    @Override
    public void doPost(Request request, Response response) throws Exception {

    }
}
