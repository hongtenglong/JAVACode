package day03.homeWork;

import java.util.Scanner;

public class ZuoYe10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int num = sc.nextInt();
		if(num % 5 ==0) {
			System.out.println("能被5整除");
		}else {
			System.out.println("不能被5整除");
		}

	}

}
