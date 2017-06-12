package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间
 * Created by lenovo on 2017/5/15.
 */
public class testdate {
    public static void main(String[] args) throws ParseException {
        Date d= new Date();
        long t=System.currentTimeMillis();
        System.out.println(t);
        Date c=new Date(1000);
        System.out.println(c.toGMTString());
        String str2="1997-7-7";
        DateFormat df2= new SimpleDateFormat("yyyy-mm-dd");

        try {
            df2.parse(str2);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
