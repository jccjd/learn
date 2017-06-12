package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by lenovo on 2017/6/5.
 */
public class Trycatch {
    public static void main(String[] args) {
        String str= new Trycatch().openFile();
        System.out.println(str);
    }
    String openFile(){
        try {
            System.out.println("aaa");
            FileInputStream fis = new FileInputStream("e:world.txt");
            int a= fis.read();
            System.out.println("bbb");
            return "step1";
        } catch (FileNotFoundException e) {
            System.out.println("catching!!!");
            e.printStackTrace();
            return "step2";
        }catch (IOException e){
            e.printStackTrace();
            return "step3";
        }finally {
            System.out.println("finally!!!!");
            return "fff";
        }
    }

}
