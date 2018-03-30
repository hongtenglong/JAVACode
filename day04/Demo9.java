package day04;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("输入班级总人数：");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			System.out.print("请输入第"+i+"位学生的成绩:");
			if(sc.nextInt()<=80)
				continue;
			count++;
		}
		System.out.println("80分以上的学生人数是:"+count);
		System.out.println("80分以上的学生所占的比例为"+((count+0.0)/num * 100)+"%");
	}
}
