package day13.stage2;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("输入一个整数：");
		num = input.nextInt();
		String s = String.valueOf(num);
		System.out.println("位数；"+s.length());
		StringBuilder sr = new StringBuilder(s);
		System.out.println("反转："+ sr.reverse());
	}

}
