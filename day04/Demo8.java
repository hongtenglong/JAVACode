package day04;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		for(int i=1;i<=5;i++) {
			System.out.print("请输入第"+i+"门课的成绩：");
			score = sc.nextInt();
			sum+= score;
			if(score < 0) {
				System.out.println("抱歉，分数录入错误，请重新进行录入！");
				break;
			}else if(i==5) {
				System.out.println("平均分为："+(sum/5.0));
			}
		}
	}
}
