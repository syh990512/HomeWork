package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {

    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生产日期,格式为:yyyy-MM-dd");
        String s=sc.next();
        System.out.println("请输入保质日期,以天为单位");
        int i=sc.nextInt();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        Calendar cal=Calendar.getInstance();
        cal.setTime(parse);
        cal.add(Calendar.DAY_OF_YEAR,i);
        cal.add(Calendar.WEEK_OF_YEAR,-2);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        String format = sdf.format(cal.getTime());
        System.out.println("最佳促销日期为:"+format);
    }
}
