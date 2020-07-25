package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		char[] c=new char[5];
		for (int i = 0; i <5; i++) {
			int j=ran.nextInt(58)+65;
			if(j>90 &&j<97){
				i--;
			}else{
				c[i]=(char)j;
			}
		}

		System.out.println(Arrays.toString(c));
		String s = String.valueOf(c);
		String s2=sc.next();
		boolean b=s.equalsIgnoreCase(s2);
		System.out.println(b);
	}
	
}
