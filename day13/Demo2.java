package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] i = new int[5];
		try {
			for (int j = 0; j < i.length; j++) {
				System.out.print("������һ��������");
				i[j] = sc.nextInt();
				return ;
			} 
		}catch (InputMismatchException e) {
			System.out.println("��ֵ������");
		}finally {
			System.out.println("�������н���");
		}
		System.out.println("����");
	}
}
