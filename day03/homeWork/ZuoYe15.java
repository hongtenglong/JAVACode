package day03.homeWork;

import java.util.Scanner;

public class ZuoYe15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年：");
		int year = sc.nextInt();
		System.out.print("请输入月：");
		int month = sc.nextInt();
		System.out.print("请输入日：");
		int day = sc.nextInt();
		int february = 28;
		int num;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			february += 1;
		}
		switch (month) {
		case 1:
			num = day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 2:
			num = 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 3:
			num = 31 + february + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 4:
			num = 31 + february + 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 5:
			num = 31 + february + 31 + 30 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 6:
			num = 31 + february + 31 + 30 + 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 7:
			num = 31 + february + 31 + 30 + 31 + 30 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 8:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 9:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 10:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 11:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		case 12:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			System.out.println(year + " 年 " + month + " 月 " + day + " 号是今年的第" + num + "天");
			break;
		default:
			System.out.println("没有这个月份");

		}
	}
}
