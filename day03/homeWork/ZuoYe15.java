package day03.homeWork;

import java.util.Scanner;

public class ZuoYe15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������꣺");
		int year = sc.nextInt();
		System.out.print("�������£�");
		int month = sc.nextInt();
		System.out.print("�������գ�");
		int day = sc.nextInt();
		int february = 28;
		int num;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			february += 1;
		}
		switch (month) {
		case 1:
			num = day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 2:
			num = 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 3:
			num = 31 + february + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 4:
			num = 31 + february + 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 5:
			num = 31 + february + 31 + 30 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 6:
			num = 31 + february + 31 + 30 + 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 7:
			num = 31 + february + 31 + 30 + 31 + 30 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 8:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 9:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 10:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 11:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		case 12:
			num = 31 + february + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			System.out.println(year + " �� " + month + " �� " + day + " ���ǽ���ĵ�" + num + "��");
			break;
		default:
			System.out.println("û������·�");

		}
	}
}
