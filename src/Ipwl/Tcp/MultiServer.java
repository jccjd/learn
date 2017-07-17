package Ipwl.Tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/17.
 */
public class MultiServer {
    public static void main(String[] args) throws IOException {
        //1,创建服务器 指定端口 SreverSocket
        ServerSocket server = new ServerSocket(8888);
        //2.接收客户端连接 阻塞式
        while (true) {
            Socket socket = server.accept();
            System.out.println("建立一个客户端连接");
            //3.发送数据
            String msg = "欢迎使用";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(msg);
            dos.close();

        }
    }
}
