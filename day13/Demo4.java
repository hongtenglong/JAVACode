package day13;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "1234";
		System.out.println("����" + s1.length() + "λ��");
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println("�����" + sb1.reverse().toString());

		// ------------------------2---------------------------
		int[] i2 = new int[30];
		for (int i = 0; i < i2.length; i++) {
			i2[i] = i + 1;
		}
		int[] number2 = new int[7];
		for (int i = 0; i < 7; i++) {
			int j = (int) (Math.random() * (i2.length - i));
			while (i2[j] == 0) {
				j = (int) (Math.random() * (i2.length - i));
			}
			number2[i] = i2[j];
			i2[j] = 0;
		}
		for (int i : number2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int count2 = 0;
		for (int i = 0; i < 7; i++) {
			System.out.println("�������" + (i + 1) + "������");
			int num = sc.nextInt();
			for (int j : number2) {
				if (j == num) {
					count2++;
					break;
				}
			}
		}
		if (count2 >= 7) {
			System.out.println("һ�Ƚ�");
		} else if (count2 >= 6) {
			System.out.println("���Ƚ�");
		} else if (count2 >= 5) {
			System.out.println("���Ƚ�");
		} else {
			System.out.println("û�н�");
		}
	}
	
	//-----------------------��-----------------------------
	
	
	
	
	
}
