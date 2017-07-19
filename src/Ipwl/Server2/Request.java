package Ipwl.Server2;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Created by lenovo on 2017/7/19.
 */
public class Request {
    private String method;
    private String url;
    private Map<String, List<String>> parameterMapValues;
    private static final String CRLF = "\r\n";
    private String requestInfo;
    private InputStream is;
    //内部
    public Request() {
        method = "";
        url = "";
        parameterMapValues = new HashMap<>();
        requestInfo = "";
    }
    public Request(InputStream is) {
        this();
        this.is = is;
        int len = 0;
        try {
            byte[] data = new byte[20480];
            len = is.read(data);
            requestInfo = new String(data,0,len);
        } catch (IOException e) {
            return;
        }
        //分析请求信息
        parseRequestInof();
    }

    private void parseRequestInof() {
        if (null == requestInfo || (requestInfo = requestInfo.trim()).equals("")) {
            return;
        }
        /**从信息的首行分解出请求方式 请求路径 请求参数(可能存在)
         *  如:GET /index.html?name=123&pwd=234 HTTP/1.1
         *
         *  如果为poet方式,请求参数可能在最后正文中
         *
        * */
        String paramString = "";//接收请求参数
        //1.获取请求方式
        String firstLine = requestInfo.substring(0,requestInfo.indexOf(CRLF));
        int idx = requestInfo.indexOf("/");
        this.method = firstLine.substring(0,idx).trim();
        String urlStr = firstLine.substring(idx,firstLine.indexOf("HTTP/")).trim();

        if (this.method.equalsIgnoreCase("post")) {

            this.url = urlStr;
            paramString = requestInfo.substring(requestInfo.lastIndexOf(CRLF)).trim();

        } else if (this.method.equalsIgnoreCase("get")) {

            if (urlStr.contains("?" )) {

                String[] urlArray = urlStr.split("\\?");
                this.url = urlArray[0];
                paramString = urlArray[1];

            } else {
                this.url = urlStr;
            }
        }
        //不存在请求参数
        if (paramString.equals("")) {
            return;
        }

        //将请求参数封装发到Map中
        parserParams(paramString);

    }

    private void parserParams(String paramString) {
        //分割 将字符串转成数组
        StringTokenizer token = new StringTokenizer(paramString,"&");
        while (token.hasMoreTokens()) {
            String keyValue = token.nextToken();
            String[] keyValues = keyValue.split("=");
            if (keyValues.length == 1) {
                keyValues = Arrays.copyOf(keyValues,2);
                keyValues[1] = null;
            }
            String key = keyValues[0].trim();
            String value = null == keyValues[1] ? null : decode(keyValues[1].trim(),"utf-8");
            //转换成Map分拣
            if (! parameterMapValues.containsKey(key)) {
                parameterMapValues.put(key, new ArrayList<>());

            }
            List<String> values = parameterMapValues.get(key);
            values.add(value);

        }
    }


    //根据页面的内容获取对应的值 :多个值
    public String[] getParameters(String name) {
        List<String> values = null;
        if ((values = parameterMapValues.get(name)) == null) {
            return null;
        } else {
            return values.toArray(new String[0]);
        }

    }
    //根据页面的内容获取对应的值 :1个值
    public String getParameter(String name) {
        String[] value = getParameters(name);
        if (null == value) {
            return null;
        }
        return value[0];
    }

    /*解决中文的问题*/
    private String decode(String value, String code) {
        try {
            return java.net.URLDecoder.decode(value,code);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getUrl() {
        return url;
    }

    public static void main(String[] args) {

    }
}
