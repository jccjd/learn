package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 打印日历
 * Created by lenovo on 2017/5/22.
 */
public class VisualCalebder {
    public static void main(String[] args) {
        String temp = "2017-5-22";
        DateFormat format= new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date data = format.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(data);//
            calendar.set(Calendar.DATE,1);//日期转为一
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK)-1);//得到这一天是星期几，得减一
            int MaxDate = calendar.getActualMaximum(Calendar.DATE);
            System.out.println(calendar.getActualMaximum(Calendar.DATE));//这个月的最大天数
            System.out.println("日\t 一 \t 二 \t 三 \t 四 \t 五 \t 六");
            //
            for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
                System.out.print("\t"+"\t"+"");
            }
            for (int i = 1; i <=MaxDate; i++) {
                if (i<10){
                    System.out.print(i+"\t"+"\t");
                }else {
                    System.out.print(i+"\t");
                }

                int w=calendar.get(Calendar.DAY_OF_WEEK);
                if(w==Calendar.SATURDAY)
                {
                    System.out.print("\n");
                }
                calendar.add(calendar.DATE,1);
            }
        }catch (ParseException e){
                e.printStackTrace();
        }
    }
}
