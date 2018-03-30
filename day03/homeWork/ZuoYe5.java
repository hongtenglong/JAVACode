package day03.homeWork;

import java.util.Scanner;

public class ZuoYe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		int i = 1;
		do{	
			System.out.println("请输入第"+i+"个学员的成绩：(输入-1结束)");
			score = sc.nextInt();
			i++;
			sum+=score;
		}while(score!=-1);
		System.out.println("学员总分为："+sum);

	}

}
