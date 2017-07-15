package Ipwl.URL;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by lenovo on 2017/7/15.
 */
public class Sever {
    public static void main(String[] args) throws IOException {
        //1.创建服务器+端口
        DatagramSocket sever = new DatagramSocket(8888);
        //2.准备接受容器
        byte[] container = new byte[1024];
        //3.封装成包
        DatagramPacket packet = new DatagramPacket(container,container.length);
        //4.接受数据
        sever.receive(packet);
        //5.分析数据
        double data = convert(packet.getData());
        System.out.println(data);
        sever.close();
    }

    private static double convert(byte[] data) throws IOException {
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
        double num = dis.readDouble();
        dis.close();
        return num;
    }
}
