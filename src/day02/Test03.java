package day02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // \.
        String next = sc.next();
        String[] arr=next.split("\\.");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
