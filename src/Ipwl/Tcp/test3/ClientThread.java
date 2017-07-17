package Ipwl.Tcp.test3;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/17.
 */
public class ClientThread {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",9999);
        new Thread(new Send(client)).start();//一条路径
        new Thread(new Receive(client)).start();//一条路径
    }
}
