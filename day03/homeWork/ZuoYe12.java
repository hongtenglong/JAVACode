package day03.homeWork;

import java.util.Scanner;

public class ZuoYe12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = sc.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春天-春暖花开 春意盎然-植树 踏青");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏天-夏日炎炎 夏雨雨人-游泳 吃雪糕");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋天-秋高气爽 秋毫无犯-赏花 登山");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬天-冬雷震震 冬日可爱-滑雪 冬眠");
			break;
		default:
			System.out.println("输入错误");

	}
	}
}
