package Ipwl.URL;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * Created by lenovo on 2017/7/15.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端+端口
        DatagramSocket client = new DatagramSocket(6666);
        //2.准备数据
        double num = 89.12;
        byte[] data = convert(num);
        //3/打包(发送的地点 以及端口)
        DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
        //4/发送
        client.send(packet);
        client.close();
    }

    private static byte[] convert(double num) throws IOException {
        byte[] data = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeDouble(num);
        dos.flush();
        data = bos.toByteArray();
        dos.close();
        return data;
    }
}
