package day03.homeWork;

import java.util.Scanner;

public class ZuoYe8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������ʹ��ѭ��������ֵ����Сֵ������0ʱ����:");
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

		System.out.println("���ֵΪ��" + max);
		System.out.println("��СֵΪ��" + min);

	}

}
