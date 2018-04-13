package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] i = new int[5];
		try {
			for (int j = 0; j < i.length; j++) {
				System.out.print("请输入一个整数：");
				i[j] = sc.nextInt();
				return ;
			} 
		}catch (InputMismatchException e) {
			System.out.println("赋值出错了");
		}finally {
			System.out.println("程序运行结束");
		}
		System.out.println("外面");
	}
}
