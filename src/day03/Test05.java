package day03;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 * 321183 1999 0512 0019
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Boolean b=true;
        String s1=null;
        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入身份证号(18位)");
            String s = sc.next();
            int length= s.length();
            s1=s;
            b=s.matches("[0-9]{18}");
        }while(!b);
        String s2=s1.substring(6,14);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Date date=sdf.parse(s2);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR,20);
        String f1 = sdf1.format(date);
        String f2 =sdf1.format(cal.getTime());
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        String f3 =sdf1.format(cal.getTime());
        System.out.println("出生日期:"+f1);
        System.out.println("20岁生日:"+f2);
        System.out.println("当周的周三为:"+f3);
    }
}
