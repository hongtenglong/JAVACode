package day13.stage2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("����һ��������");
		num = input.nextInt();
		String s = String.valueOf(num);
		System.out.println("λ����"+s.length());
		StringBuilder sr = new StringBuilder(s);
		System.out.println("��ת��"+ sr.reverse());
	}

}
