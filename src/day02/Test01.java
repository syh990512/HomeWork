package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String s = sc.next();
        boolean isnum=s.matches("[0-9]+");
        boolean isfloat=s.matches("[0-9]+[.]{1}[0-9]+");
        if(isnum){
            int i=(Integer.valueOf(s))*10;
            System.out.println("是一个整数,乘以十得:"+i);
        }
        if(isfloat){
            double j=(Double.valueOf(s))*5;
            System.out.println("是一个小数,乘以五得:"+j);
        }
        if(isnum==false && isfloat==false){
            System.out.println("不是一个数字");
        }
    }
}
