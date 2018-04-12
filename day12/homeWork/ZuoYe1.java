package day12.homeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ZuoYe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入文件名：");
		String fileName = sc.next();
		Pattern p1 = Pattern.compile("[a-zA-Z0-9]+.java");
		Matcher m1 = p1.matcher(fileName);
		System.out.println(m1.matches());
		System.out.print("请输入邮箱：");
		String email = sc.next();
		Pattern p2 = Pattern.compile("\\w+@\\w+.com");
		Matcher m2 = p2.matcher(email);
		System.out.println(m2.matches());
	}

}
