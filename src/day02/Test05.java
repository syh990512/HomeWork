package day02;

import java.util.Date;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		boolean b=s.matches("[a-zA-Z0-9]+[.]{1}[jpg]{3}");
		if(!b){
			System.out.println("输入错误");
		}else{
			Date date=new Date();
			long l=date.getTime();
			String s1= Long.toString(l);
			String s2 = s.replaceAll("^[a-zA-Z0-9]+", s1);
			System.out.println(s2);
		}
	}
}
