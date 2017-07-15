package Ipwl.Tcp;

import java.io.*;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/15.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端 必须指定服务器+端口
        Socket client = new Socket("localhost",8888);
        //2.接收数据
        /*
        BufferedReader br = new BufferedReader(
                new InputStreamReader(client.getInputStream())
        );
        String echo = br.readLine();//阻塞式
        System.out.println(echo);
        */
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String echo = dis.readUTF();
        System.out.println(echo);
    }
}
