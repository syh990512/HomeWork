package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        String s="2020-07-05";
        Calendar cal1= Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date p1 = sdf.parse(s);
        Calendar cal2=Calendar.getInstance();
        cal2.setTime(p1);
        int i = cal1.get(Calendar.DAY_OF_YEAR);
        int j=cal2.get(Calendar.DAY_OF_YEAR);
        int w=(i-j)/7;
        System.out.println(w);

    }



}
