package Ipwl.Tcp.test3;

import java.io.*;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/17.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",9999);
        //控制台输入流
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        DataInputStream dis = new DataInputStream(client.getInputStream());
        while (true) {
            String info = console.readLine();
            //输出流
            dos.writeUTF(info);
            dos.flush();
            //输出流
            String msg = dis.readUTF();
            System.out.println(msg);
        }
    }
}
