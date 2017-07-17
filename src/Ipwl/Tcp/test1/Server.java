package Ipwl.Tcp.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/17.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            Socket client = server.accept();
            //写出数据
            //输入流
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dos = new DataOutputStream(client.getOutputStream());
            while (true) {
                String msg = dis.readUTF();
                //输出流
                dos.writeUTF("server -->" + msg);
                dos.flush();
            }
        }
    }
}
