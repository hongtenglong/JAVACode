package day12;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, password;
		int i = 1;
		for (; i <= 3; i++) {
			System.out.print("请输入用户名：");
			username = sc.next();
			System.out.print("请输入密码：");
			password = sc.next();
			if (username.equals("htl") && password.equals("abc")) {
				System.out.println("欢迎登陆MyShopping系统");
				break;
			} else {
				System.out.println("输入错误！您还有" + (3-i) + "次机会！");
			}
		}
		if(i>3) {
			System.out.println("对不起，您3次均输入错误!");
		}
	}

}
