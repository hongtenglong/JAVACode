package day03.homeWork;

import java.util.Scanner;

public class ZuoYe5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int score;
		int i = 1;
		do{	
			System.out.println("�������"+i+"��ѧԱ�ĳɼ���(����-1����)");
			score = sc.nextInt();
			i++;
			sum+=score;
		}while(score!=-1);
		System.out.println("ѧԱ�ܷ�Ϊ��"+sum);

	}

}
