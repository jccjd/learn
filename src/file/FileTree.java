package file;

import java.io.File;

/**
 * 打印树目录
 * Created by lenovo on 2017/5/23.
 */
public class FileTree {
    public static void main(String[] args) {
        File f = new File("d:/testFile");
        printFile(f,0);

    }
    static void  printFile(File file,int level){
        for (int i = 0; i <level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                printFile(temp ,level+1);
            }

        }
    }
}