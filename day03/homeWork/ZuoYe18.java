package day03.homeWork;

import java.util.Scanner;

public class ZuoYe18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int sum1 = 0;
			System.out.println("欢迎来到第" + i + "家商场");
			for (int j = 0; j < 3; j++) {
				System.out.print("请输入购物金额：");
				sum1 += sc.nextInt();
			}
			System.out.println("离开第" + i + "家商场结账" + sum1);
			sum += sum1;
		}
		System.out.println("五家总消费" + sum);

	}

}
