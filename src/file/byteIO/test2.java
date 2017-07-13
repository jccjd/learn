package file.byteIO;

import java.io.*;

/**
 * 写文件
 * 1 . 建立联系 File对象 目的地
 * 2. 选择流 文件输出 OutputStream FileOutputStream
 * 3.操作； write（）+flush
 * 4.释放资源
 * Created by lenovo on 2017/7/13.
 */
public class test2 {
    public static void main(String[] args) {
        //1.建立联系 File对象 目的地
        File dest = new File("E:/world.txt");
        //2.选择流 文件输出流 OutputStream FileOutputStream
        OutputStream os = null;
        try {
            //以追加形式写出文件必须为true 否则为覆盖
            os = new FileOutputStream(dest,true);
            String str = "test ,test ,test\r\n";
            //字符串转数组
            byte[] data = str.getBytes();
            os.write(data,0,data.length);
            os.flush();//强制刷新出去
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件未找到");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件写出失败");
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("关闭输出流失败");
            }
        }
    }
}
