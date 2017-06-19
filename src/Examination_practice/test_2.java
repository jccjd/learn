package Examination_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Print console inputfdf
 * Created by lenovo on 2017/6/19.
 */
public class test_2 {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb= new StringBuffer();
        for(int i= 0;i<3;i++){
            String str=null;
            try {
                str=bf.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            sb.append(str);
        }
        System.out.println("output string:"+sb.toString());
    }
}
