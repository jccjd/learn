package Ipwl.Server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * Created by lenovo on 2017/7/18.
 */
public class Server5 {
    private ServerSocket server;
    private static final String CRLF="\r\n";
    private static final String BLABK=" ";

    public static void main(String[] args) {
        Server3 server = new Server3();
        server.start();
    }
    public void start() {
        try {
            server = new ServerSocket(8888);
            this.receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void receive() {
        try {
            Socket client = server.accept();
            //请求
            Request request = new Request(client.getInputStream());
            //响应
            Response rep = new Response(client);
            rep.println("<html><head><title>test</title></head>");
            rep.println("<body>");
            rep.println("欢迎:").println(request.getParameter("uname")).println("回来");
            rep.println("</body></html>");
            rep.pushTOCLient(200);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
