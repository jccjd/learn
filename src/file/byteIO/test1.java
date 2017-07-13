package file.byteIO;

import java.io.*;

/**
 * 1.建立联系 File对象
 * 2. 选择流   文件输入流 InputStream FileInputStream
 * 3. 操作 : byte[] car= new byte[1024]:+read+读取大小
 *      输出
 * 4.释放资源:关闭
 * Created by lenovo on 2017/7/13.
 */
public class test1 {
    public static void main(String[] args) {
        //1,建立联系 File对象
        File src = new File("e:/world.txt");
        //2.选择流
        InputStream is = null; // 提升作用域
        try {
            is = new FileInputStream(src);
            //3.操作 不断读取 缓存数组
            byte[]  car = new byte[1024];
            int len = 0;//接受 实际读取大小
            //循环读取
            StringBuilder sb = new StringBuilder();
            while (-1 != (len = is.read(car))) {
                //输出 字符数组转成字符串
                String info = new String(car,0,len);
                sb.append(info);
            }
            System.out.println(""+sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println("关闭流失败(一般不会失败)");
                }
            }
        }
    }
}
