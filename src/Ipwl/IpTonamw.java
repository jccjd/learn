package Ipwl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by lenovo on 2017/6/18.
 */
public class IpTonamw {
    public static void main(String[] args) {
        String IP = null;
        for (int i =100; i<=150; i++){
            IP = "192.168.1."+i;
            try {
                InetAddress host;
                host = InetAddress.getByName(IP);
                if(host.isReachable(1000)){
                    String hostName = host.getHostName();
                    System.out.println("IP地址" +IP+"的主机名称是"+hostName);
                }
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("搜索完毕");
    }
}
