package day03.homeWork;

import java.util.Scanner;

public class ZuoYe12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = sc.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("����-��ů���� ���ⰻȻ-ֲ�� ̤��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����-�������� ��������-��Ӿ ��ѩ��");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����-�����ˬ ����޷�-�ͻ� ��ɽ");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("����-�������� ���տɰ�-��ѩ ����");
			break;
		default:
			System.out.println("�������");

	}
	}
}
