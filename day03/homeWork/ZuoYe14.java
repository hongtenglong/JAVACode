package day03.homeWork;

import java.util.Scanner;

public class ZuoYe14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ӣ�ĵ��ʵĵ�һ����ĸ�ж����ڼ���");
		char c = sc.next().charAt(0);
		switch (c) {
		case 'm':
			System.out.println("����һ");
			break;
		case 't':
			System.out.print("������ڶ�����ĸ��");
			if (sc.next().charAt(0) == 'u') {
				System.out.println("���ڶ�");
			} else if (sc.next().charAt(0) == 'h') {
				System.out.println("������");
			} else {
				System.out.println("û���������");
			}
			break;
		case 'w':
			System.out.println("������");
			break;
		case 'f':
			System.out.println("������");
			break;
		case 's':
			System.out.print("������ڶ�����ĸ��");
			if (sc.next().charAt(0) == 'u') {
				System.out.println("������");
			} else if (sc.next().charAt(0) == 'a') {
				System.out.println("������");
			} else {
				System.out.println("û���������");
			}
			break;
		}

	}

}
