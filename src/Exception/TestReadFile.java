package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by lenovo on 2017/6/5.
 */
public class TestReadFile {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
            fileReader= new FileReader("e:world.txt");
            char c=  (char) fileReader.read();
            char c1= (char) fileReader.read();
            System.out.println(""+c+c1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
