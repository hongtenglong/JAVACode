package day03.homeWork;

import java.util.Scanner;

public class ZuoYe11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������0-6��������");
		int num = sc.nextInt();
		switch (num) {
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;

		default:
			System.out.println("��������");
			break;
		}

	}

}
