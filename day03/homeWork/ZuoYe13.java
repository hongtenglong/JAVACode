package day03.homeWork;

import java.util.Scanner;

public class ZuoYe13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����һ��ʱ�䣨������");
		int num = sc.nextInt();
		if (num >= 6 && num <= 10) {
			System.out.println("���Ϻ�");
		} else if (num >= 11 && num <= 13) {
			System.out.println("�����");
		} else if (num >= 14 && num <= 18) {
			System.out.println("�����");
		} else {
			System.out.println("��Ϣʱ��");
		}

	}

}
