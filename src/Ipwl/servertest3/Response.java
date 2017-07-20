package Ipwl.servertest3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

/**
 * 封装响应信息
 * Created by lenovo on 2017/7/18.
 */
public class Response {
    //两个常量
    public static final String CRLF = "\r\n";
    public static final String BLACK = " ";
    //流
    private BufferedWriter bw;
    //正文
    private StringBuilder content;
    //存储头信息
    private StringBuilder headInfo;
    //存储正文长度
    private  int len = 0;
    public Response() {
        headInfo = new StringBuilder();
        content = new StringBuilder();
        len = 0;
    }
    public Response(Socket client) {
        this();
        try {
            bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            headInfo = null;
        }
    }
    public Response(OutputStream so) {
        this();
        bw = new BufferedWriter(new OutputStreamWriter(so));
    }
    /*构建正文*/
    public Response print(String info) {
        content.append(info);
        len += info.getBytes().length;
        return this;
    }
    /**
     * 构建正文+回车
    * */
    public Response println(String info) {
        content.append(info).append(CRLF);
        len +=(info+ CRLF).getBytes().length;
        return this;
    }
    /**构建响应头
     * */
    private void createHeadInfo(int code) {
        //1.http协议版本,状态码,描述
        headInfo.append("HTTP/1.1").append(BLACK).append(code).append(BLACK);
        switch (code) {
            case 200 :
                headInfo.append("OK");
                break;
            case 404 :
                headInfo.append("NOT FOUND");
                break;
            case 500 :
                headInfo.append("SERVER ERROR");
                break;
        }
        headInfo.append(CRLF);
        //2.响应头
        headInfo.append("Server:fdfd Server/2.3.3.35").append(CRLF);
        headInfo.append("Date:").append(new Date()).append(CRLF);
        headInfo.append("Content-type:text/html;charset=UTF-8").append(CRLF);
    //  3.正文长度:字节长度
        headInfo.append("Content-Length:").append(len).append(CRLF);
        headInfo.append(CRLF);//分割符

    }
    //推送到客户端
    void pushTOCLient(int code) {
        if (null == headInfo) {
            code = 500;
        }
        createHeadInfo(code);
        //头信息+分隔符
        try {
            bw.append(headInfo.toString());
            bw.append(content.toString());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
