package Ipwl.Tcp.test3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**发送数据线程
 * Created by lenovo on 2017/7/17.
 */
public class Send implements Runnable{
    //控制台输入流
    private BufferedReader console;
    //管道输入流
    private DataOutputStream dos;
    //控制线程
    private boolean isRuning = true;

    public Send() {
        console = new BufferedReader(new InputStreamReader(System.in));
    }
    public Send(Socket client) {
        this();
        try {
            dos = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isRuning = false;
            try {
                dos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
    private String getMsgFromConsole() {
        try {
            return console.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public void send() {
        String msg = getMsgFromConsole();
        if (null != msg && !msg.equals("")) {
            try {
                dos.writeUTF(msg);
                dos.flush();
            } catch (IOException e) {
                e.printStackTrace();
                isRuning = false;
                closeUtil.closeAll(dos);
            }
        }
    }

    @Override
    public void run() {
        while (isRuning) {
            send();
        }
    }
}
