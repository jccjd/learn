package Ipwl.Tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/15.
 */
public class Serve {
    public static void main(String[] args) throws IOException {
        //1.创建服务器 指定端口
        ServerSocket server = new ServerSocket(8888);
        //2.接收客户端连接 阻塞式
        Socket socket = server.accept();
        System.out.println("一个客户端建立连接");
        //3.发数据
        String msg = "欢迎使用";
        //输出流
        /*
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        socket.getOutputStream()
                )
        );
        bw.write(msg);
        bw.newLine();
        bw.flush();
        */
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(msg);
        dos.flush();
    }
}
