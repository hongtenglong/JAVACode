package day03.homeWork;

import java.util.Scanner;

public class ZuoYe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入数字n：");
		int n = sc.nextInt();
		System.out.print("请输入个数：");
		int num = sc.nextInt();
		int s = n;
		int sum = n;
		System.out.println("数字是："+n);
		for(int i = 1; i<num;i++) {
			n *= 10;
			s += n;
			sum += s;
			System.out.println("数字是："+s);
		}
		
		System.out.println("结果是："+sum);

	}

}
