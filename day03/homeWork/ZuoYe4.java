package day03.homeWork;

import java.util.Scanner;

public class ZuoYe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������n��");
		int n = sc.nextInt();
		System.out.print("�����������");
		int num = sc.nextInt();
		int s = n;
		int sum = n;
		System.out.println("�����ǣ�"+n);
		for(int i = 1; i<num;i++) {
			n *= 10;
			s += n;
			sum += s;
			System.out.println("�����ǣ�"+s);
		}
		
		System.out.println("����ǣ�"+sum);

	}

}
