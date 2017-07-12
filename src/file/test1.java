package file;

import java.io.File;

/** 路径分隔符:
 *  名称分隔符 \(windows) /(Linux)
 * Created by lenovo on 2017/7/12.
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        //路径表示形式
        String path = "C:\\Users\\lenovo\\Desktop\\code";
        path = "C:" +File.separator+"Users"+File.separator+"lenovo"+File.separator+"Desktop";
        //推荐方式
        path = "C:/Users/lenovo/Desktop/code";

    }

}
