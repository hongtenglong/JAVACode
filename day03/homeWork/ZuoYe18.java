package day03.homeWork;

import java.util.Scanner;

public class ZuoYe18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int sum1 = 0;
			System.out.println("��ӭ������" + i + "���̳�");
			for (int j = 0; j < 3; j++) {
				System.out.print("�����빺���");
				sum1 += sc.nextInt();
			}
			System.out.println("�뿪��" + i + "���̳�����" + sum1);
			sum += sum1;
		}
		System.out.println("���������" + sum);

	}

}
