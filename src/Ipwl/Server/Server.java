package Ipwl.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**创建服务器
 * Created by lenovo on 2017/7/18.
 */
public class Server {
    private ServerSocket server;
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    public void start() {
        try {
            server = new ServerSocket(8888);
            receive();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*接收客户端*/
    private void receive() {
        try {
            Socket client = server.accept();
           StringBuilder sb = new StringBuilder();
           String msg = null;
           BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        while ((msg = br.readLine()).length() > 0) {
            sb.append(msg);
            sb.append("\r\n");
            /*接收客户端的请求信息*/
            String requestinfo = sb.toString().trim();
            System.out.println(requestinfo);
        }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*停止服务器*/
    public void stop() {

    }

}
