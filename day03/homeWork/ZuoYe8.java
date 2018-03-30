package day03.homeWork;

import java.util.Scanner;

public class ZuoYe8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一批整数，使用循环求出最大值与最小值，输入0时结束:");
		int i;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		do {
			i = sc.nextInt();
			if (i > max) {
				max = i;
			}
			if (i < min && i != 0) {
				min = i;
			}
		} while (i != 0);

		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);

	}

}
