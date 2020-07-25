package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 *
 */
public class Test01 {
	public static void main(String[] args) {
		String str = "HelloWorld";
		test1(str);
		//以下自行调用test2,test3...等方法。
		tset2(str);
		tset3(str);
		tset4(str);
		tset5(str);
		tset6(str);
		tset7(str);
		tset8(str);
		tset9(str);
	}

	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 *
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
	public static void test1(String str){
		System.out.println("输出字符串\"HelloWorld\"的字符串长度:"+str.length());
	}

	private static void tset2(String str) {
		int num=str.indexOf("o");
		System.out.println("输出\"HelloWorld\"中\"o\"的位置:"+num);
	}
	private static void tset3(String str) {
		int num=str.indexOf("o",5);
		System.out.println("输出\"HelloWorld\"中从下标5出开始第一次出现\"o\"的位置:"+num);
	}
	private static void tset4(String str) {
		String str2=str.substring(0,5);
		System.out.println("截取\"HelloWorld\"中的\"Hello\"并输出:"+str2);
	}
	private static void tset5(String str) {
		String str2=str.substring(5);
		System.out.println("截取\"HelloWorld\"中的\"World\"并输出:" +str2);
	}
	private static void tset6(String str) {
		String str2=" Hello  ".trim();
		System.out.println("将字符串\"  Hello   \"中两边的空白去除后输出:"+str2);
	}
	private static void tset7(String str) {
		char str2=str.charAt(6);
		System.out.println("输出\"HelloWorld\"中第6个字符\"W\":"+str2);
	}
	private static void tset8(String str) {
		boolean b=str.startsWith("h")&&str.endsWith("ld");
		System.out.println("输出\"HelloWorld\"是否是以\"h\"开头和\"ld\"结尾的:"+b);
	}
	private static void tset9(String str) {
		String s = str.toUpperCase();
		String s2 = str.toLowerCase();
		System.out.println("将\"HelloWorld\"分别转换为全大写和全小写并输出:"+s+"\t"+s2);
	}




}
