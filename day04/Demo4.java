package day04;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		for(int i = 1;i <= 10;i++) {
			System.out.print("请输入第"+i+"位顾客的年龄：");
			if(sc.nextInt()<30) {
				a++;
			}else {
				b++;
			}
		}
		System.out.println("30以下的比例是："+a+"0.0%");
		System.out.println("30以上(含30)的比例是："+b+"0.0%");
	}

}
