package day08;

import java.util.Random;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int num = new Random().nextInt(11);
		System.out.println(num);
		for (int i = 1; i < 6; i++) {
			count++;
			System.out.print("������²�����֣�");
			int a = sc.nextInt();
			if(a<num) {
				System.out.println("��С��!");
			}else if(a>num) {
				System.out.println("�´���!");
			}else {
				if(count<=3) {
					System.out.println("̫������");
				}else if(count<=5) {
					System.out.println("������");
				}
				break;
			}
		}
		if(count == 5) {
			System.out.println("̫����");
		}
	}
}
