package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入3个日期,格式为yyyy-MM-dd");
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse(s1);
        Date date2=sdf.parse(s2);
        Date date3=sdf.parse(s3);
        List<Date> c=new ArrayList<>();
        c.add(date1);
        c.add(date2);
        c.add(date3);
        Collections.sort(c);
        System.out.println(c);

    }
}
