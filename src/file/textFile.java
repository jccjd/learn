package file;

import java.io.File;
import java.io.IOException;

/**
 *
 * Created by lenovo on 2017/5/23.
 */
public class textFile {
    public static void main(String[] args) {
        File f= new File("d:/testFile/file.txt");
        File f2 = new File("d:/testFile");
        File f3 = new File(f2,"text.java");
        File f4 = new File(f2,"dd");
        f4.mkdir();
        File f5 = new File(f2,"textFile/sd/sf/sf");
        f5.mkdirs();


//            f3.createNewFile();
            f3.delete();
        System.out.println(f.lastModified());
        if (f.isFile()){
            System.out.println("is a file");
        }
        if (f2.isDirectory()){
            System.out.println("is a directory");
        }
    }
}
