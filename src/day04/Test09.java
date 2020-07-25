package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String[] s1=s.split("[;]{1}");
        System.out.println(Arrays.toString(s1));
        Collection<Emp> c=new ArrayList<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < s1.length; i++) {
            Emp emp=new Emp();
            String[] s2=s1[i].split("[,]");
            emp.setName(s2[0]);
            emp.setAge(Integer.parseInt(s2[1]));
            emp.setGender(s2[2]);
            emp.setSalary(Integer.parseInt(s2[3]));
            Date parse = sdf.parse(s2[4]);
            emp.setBirthday(parse);
            c.add(emp);
        }
        for(Emp e:c){
            System.out.println(e);
        }
        Calendar cal=Calendar.getInstance();
        for(Emp e:c){
            cal.setTime(e.getBirthday());
            cal.add(Calendar.MONTH,3);
            cal.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
            Date time = cal.getTime();
            String format = sdf.format(time);
            System.out.println(e.getName()+"的转正日期为:"+format);
        }
    }
}
