package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Collection<Emp> col=new ArrayList<>();
        Scanner sc=new Scanner (System.in);
        System.out.println("请输入员工数量");
        int number = sc.nextInt();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i <number; i++) {
            Emp emp=new Emp();
            System.out.println("请输入员工信息(例:张三,25,男,5000,2006-02-15)");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String s=sc.next();
            String[] split = s.split("[,]");
            emp.setName(split[0]);
            emp.setAge(Integer.parseInt(split[1]));
            emp.setGender(split[2]);
            emp.setSalary(Integer.parseInt(split[3]));
            emp.setBirthday(sdf.parse(split[4]));
            boolean contains = col.contains(emp);
            if(contains){
                System.out.println("用户已存在");
                i--;
            }else{
                col.add(emp);
            }
        }
        System.out.println(col);
    }
}
