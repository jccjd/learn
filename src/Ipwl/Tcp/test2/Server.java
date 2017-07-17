package Ipwl.Tcp.test2;

import java.io.Closeable;
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
    private class Mychannel implements Runnable {
        private DataInputStream dis;
        private DataOutputStream dos;
        private boolean isRunning = true;
        public Mychannel(Socket client) {
            try {
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
            } catch (IOException e) {
                isRunning = false;
                closeUtil.closeAll(dis,dos);
                e.printStackTrace();
            }
        }
        /*接收数据
        * */
        private String receive() {
            String msg = "";
            try {
                msg = dis.readUTF();
            } catch (IOException e) {
                e.printStackTrace();
                closeUtil.closeAll(dis);
                isRunning = false;

            }
            return msg;
        }
        /*发送数据
        * */
        private void send(String msg) {
            if (null == msg || msg.equals("")) {
                return;
            }
            try {
                dos.writeUTF(msg);
            } catch (IOException e) {
                e.printStackTrace();
                closeUtil.closeAll(dos);
                isRunning = false;
            }
        }
        //
        @Override
        public void run() {

        }
    }
}
