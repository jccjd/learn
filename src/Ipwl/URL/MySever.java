package Ipwl.URL;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by lenovo on 2017/7/15.
 */
public class MySever {
    public static void main(String[] args) throws IOException {
//        1.创建服务端+端口
        DatagramSocket sever = new DatagramSocket(8888);
        //2.准备接受容器
        byte[] container = new byte[1024];
        //3.封装成包
        DatagramPacket packet = new DatagramPacket(container,container.length);
        //4.接收数据
        sever.receive(packet);
        //5.分析数据
        byte[] data = packet.getData();
        int len = packet.getLength();
        System.out.println(new String(data,0,len));
        //6.释放
        sever.close();

    }
}
