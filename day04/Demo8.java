package day04;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		for(int i=1;i<=5;i++) {
			System.out.print("�������"+i+"�ſεĳɼ���");
			score = sc.nextInt();
			sum+= score;
			if(score < 0) {
				System.out.println("��Ǹ������¼����������½���¼�룡");
				break;
			}else if(i==5) {
				System.out.println("ƽ����Ϊ��"+(sum/5.0));
			}
		}
	}
}
