package day03.homeWork;

import java.util.Scanner;

public class ZuoYe14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("根据英文单词的第一个字母判断星期几：");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'm':
			System.out.println("星期一");
			break;
		case 't':
			System.out.print("请输入第二个字母：");
			if (sc.next().charAt(0) == 'u') {
				System.out.println("星期二");
			} else if (sc.next().charAt(0) == 'h') {
				System.out.println("星期四");
			} else {
				System.out.println("没有这个星期");
			}
			break;
		case 'w':
			System.out.println("星期三");
			break;
		case 'f':
			System.out.println("星期五");
			break;
		case 's':
			System.out.print("请输入第二个字母：");
			if (sc.next().charAt(0) == 'u') {
				System.out.println("星期日");
			} else if (sc.next().charAt(0) == 'a') {
				System.out.println("星期六");
			} else {
				System.out.println("没有这个星期");
			}
			break;
		}

	}

}
