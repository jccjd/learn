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
public class Server3 {
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
            byte[] data = new byte[20480];
            int len = client.getInputStream().read(data);
            String requestInfo = new String(data,0,len).trim();
            System.out.println(requestInfo);

            //响应
            StringBuilder responseContext = new StringBuilder();
            responseContext.append("<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>test</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<pre> method:请求方式 get/post\n" +
                    "\t\tget:数据量小 hhhh安全性不高 默认方式\n" +
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
            StringBuilder response = new StringBuilder();
            //1.http协议版本 状态代码 描述
            response.append("HTTP/1.1").append(BLABK).append("200").append(BLABK).append("OK");
            //2.响应头(response head)
            response.append("Server:fdfd Server/2.3.3.35").append(CRLF);
            response.append("Date:").append(new Date()).append(CRLF);
            response.append("Content-type:text/html;charset=UTF-8").append(CRLF);

            //正文的长度
            response.append("Content-Length:").append(responseContext.toString().getBytes().length).append(CRLF);
            response.append(CRLF);
            //4.正文
            response.append(responseContext);

            //输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            bw.write(response.toString());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
