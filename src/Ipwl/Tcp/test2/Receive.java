package Ipwl.Tcp.test2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by lenovo on 2017/7/17.
 */
public class Receive implements Runnable {
    //输入流
    private DataInputStream dis;
    //线程标识
    private boolean isRuning = true;

    public Receive() {
    }
    public Receive(Socket client) {
        try {
            dis = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRuning = false;
            try {
                dis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    /*接收数据*/
    public String receive() {
        String msg = "";
        try {
            msg = dis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
            isRuning = false;
            closeUtil.closeAll(dis);
        }
        return msg;
    }

    @Override
    public void run() {
        while (isRuning) {
            System.out.println(receive());
        }
    }
}
