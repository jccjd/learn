package Ipwl.Tcp.test3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/7/17.
 */
public class Server {
    private List<Mychannel> all = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        new Server().start();
    }
    public void start() throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            Socket client = server.accept();
            Mychannel channel = new Mychannel(client);
            all.add(channel);
            new Thread(channel).start();
        }

    }

    private class Mychannel implements Runnable {
        private DataInputStream dis;
        private DataOutputStream dos;
        private boolean isRunning = true;
        private String name;
        public Mychannel(Socket client) {
            try {
                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
                this.name = dis.readUTF();
                sendOthers(this.name+"进入聊天室",true);
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
                all.remove(this);

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
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
                closeUtil.closeAll(dos);
                all.remove(this);
                isRunning = false;
            }
        }
        /*发送给其他客户端*/
        private void sendOthers(String msg, boolean sys) {
            //是否为私聊
            if (msg.startsWith("@") && msg.indexOf(":") > -1) {
                //获取name
                String name = msg.substring(1, msg.indexOf(":"));
                String content = msg.substring(msg.indexOf(":" + 1));
                for (Mychannel other : all) {
                    if (other.name.equals(name)) {
                        other.send(this.name + "对你悄悄的说" + content);
                    }
                }
            } else {
                //遍历容器
                for (Mychannel other : all) {
                    if (other == this) {
                        continue;
                    }
                    if (sys) {
                        other.send("系统信息" + msg);
                    } else {
                        //发送给其他客户
                        other.send(this.name+"对所以人说"+msg);
                    }
                }
            }
        }
        //
        @Override
        public void run() {
            while (isRunning) {
                sendOthers(receive(),false);
            }
        }
    }
}
