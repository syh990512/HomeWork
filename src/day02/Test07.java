package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s = sc.next();
     boolean b=s.matches("[0-9]+[-+*/]{1}[0-9]+");
     if(!b){
         System.out.println("格式错误");
     }else{
         String[] s1 = s.split("[-/*+]");
        int x=Integer.parseInt(s1[0]);
        int y=Integer.parseInt(s1[1]);
        if(s.contains("+")){
            System.out.println(""+x+"+"+y+"="+sum(x,y));
        }else if(s.contains("-")){
            System.out.println(""+x+"-"+y+"="+minus(x,y));
        }else if(s.contains("*")){
            System.out.println(""+x+"*"+y+"="+multoply(x,y));
        }else if(s.contains("/")){
            System.out.println(""+x+"/"+y+"="+divide(x,y));
        }
     }
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multoply(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }
}
