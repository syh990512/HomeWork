package day02;
/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Person p1=new Person("张三",25,"男",5000);
        Person p2=new Person("李四",26,"女",6000);
        Person p3=new Person("王五",20,"男",7000);
        Person[] p=new Person[3];
        p[0]=p1;
        p[1]=p2;
        p[2]=p3;
        for(Person per:p){
            System.out.println(per);
        }
    }
}
