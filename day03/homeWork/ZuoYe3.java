package day03.homeWork;

import java.util.Scanner;

public class ZuoYe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("不是素数");
				return;
			}
		}
		System.out.println("是素数");
	}

}
