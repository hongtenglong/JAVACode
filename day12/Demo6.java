package day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.设置正则表达式
		Pattern p1 = Pattern.compile("\\d{6}");
		//2.设置要验证的字符串
		Matcher m1 = p1.matcher("123456");
		//3.验证
		System.out.println(m1.matches());
		
		
		System.out.print("电话：");
		String phone = sc.next();
		Pattern p2 = Pattern.compile("1\\d{10}");
		Matcher m2 = p1.matcher(phone);
		System.out.println(m2.matches());
		
		
		System.out.print("密码：");
		String password = sc.next();
		Pattern p3 = Pattern.compile("\\w{4,10}");
		Matcher m3 = p1.matcher(password);
		System.out.println(m3.matches());
		
		
		
		System.out.print("账号：");
		String username = sc.next();
		Pattern p4 = Pattern.compile("[a-zA-z]\\w{3,15}");		
		Matcher m4 = p4.matcher(username);
		System.out.println(m4.matches());
	}
}
