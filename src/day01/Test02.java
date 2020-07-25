package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String str="大家好!";
		String s = test1(str);
		String s1 = test2(s);
		String s2 = test3(s1);
		String s3 = test4(s2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	public static String test1(String str){
		String str2=str.concat("我是程序员!");
		return str2;
	}
	public static String test2(String str){
		String str2=str.substring(0,6)+"优秀的"+str.substring(6);
		return str2;
	}
	public static String test3(String str){
		String str2=str.replace("优秀","牛牛");
		return str2;
	}
	public static String test4(String str){
		String str2=str.substring(4);
		return str2;
	}

}
