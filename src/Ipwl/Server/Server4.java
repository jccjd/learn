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
public class Server4 {
    private ServerSocket server;
    private static final String CRLF="\r\n";
    private static final String BLABK=" ";

    public static void main(String[] args) {
        Server4 server = new Server4();
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
            byte[] data = new byte[20480];
            int len = client.getInputStream().read(data);
            String requestInfo = new String(data,0,len).trim();
            System.out.println(requestInfo);

            //响应
          Response rep = new Response(client);
          rep.println("<!DOCTYPE html>\n" +
                  "<html lang=\"en\">\n" +
                  "<head>\n" +
                  "    <meta charset=\"UTF-8\">\n" +
                  "    <title>test</title>\n" +
                  "</head>\n" +
                  "<body>\n" +
                  "<pre> method:请求方式 get/post\n" +
                  "\t\tget:数据量小 安全性不高 默认方式\n" +
                  "\n" +
                  "\t\tpost: 量大 安全性高\n" +
                  "\t\taction:请求的服务器路径\n" +
                  "\t\tid : 前段区分唯一性\n" +
                  "\t\tname: 后端(服务器) 区分唯一性 获取值\n" +
                  "\t\t只要数据提交给后台必须存在name\n" +
                  "\t</pre>\n" +
                  "\n" +
                  "<form method=\"post\" action=\"http://localhost:8888/index.html\">\n" +
                  "    用户名:<input type=\"text\" name=\"unme\" id=\"name\">\n" +
                  "    密码:<input type=\"password\" name=\"pwd\" id=\"pass\">\n" +
                  "    <input type=\"submit\" value=\"登录\">\n" +
                  "</form>\n" +
                  "</body>\n" +
                  "</html>");
          rep.pushTOCLient(200);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
