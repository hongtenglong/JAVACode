package day03.homeWork;

import java.util.Scanner;

public class ZuoYe3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("��������");
				return;
			}
		}
		System.out.println("������");
	}

}
