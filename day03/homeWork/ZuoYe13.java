package day03.homeWork;

import java.util.Scanner;

public class ZuoYe13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("输入一个时间（整数）");
		int num = sc.nextInt();
		if (num >= 6 && num <= 10) {
			System.out.println("早上好");
		} else if (num >= 11 && num <= 13) {
			System.out.println("中午好");
		} else if (num >= 14 && num <= 18) {
			System.out.println("下午好");
		} else {
			System.out.println("休息时间");
		}

	}

}
