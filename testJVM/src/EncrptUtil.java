import java.io.*;

/**
 * 加密工具
 * */
public class EncrptUtil {


//    public static void main(String[] args) throws IOException {
//        encrpt("E:/dc/te.class","E:/dc/new/te.class");
//    }

    public static void encrpt(String src, String dest) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
        int temp = -1;
        while ((temp = fis.read())!=-1) {
            fos.write(temp^0xff);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
