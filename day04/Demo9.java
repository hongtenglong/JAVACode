package day04;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("����༶��������");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			System.out.print("�������"+i+"λѧ���ĳɼ�:");
			if(sc.nextInt()<=80)
				continue;
			count++;
		}
		System.out.println("80�����ϵ�ѧ��������:"+count);
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ"+((count+0.0)/num * 100)+"%");
	}
}
