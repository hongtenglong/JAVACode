package day08.homeWork;

import java.util.Scanner;

public class ZuoYe2 {

	public static void main(String[] args) {
		String [] names = {"ϲ����","������","������","������","ů����"};
		System.out.println("�Ƿ�齱��(y/n)");
		Scanner sc = new Scanner(System.in);
		boolean b = sc.next().equals("y")?true:false;
		do{
			int i = (int)(Math.random()*5+1);
			System.out.println(names[i-1]+" �н���");
			System.out.println("�Ƿ�����齱��(y/n)");
			b = sc.next().equals("y")?true:false;
		}while(b);
	}

}
