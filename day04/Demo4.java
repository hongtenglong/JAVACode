package day04;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		for(int i = 1;i <= 10;i++) {
			System.out.print("�������"+i+"λ�˿͵����䣺");
			if(sc.nextInt()<30) {
				a++;
			}else {
				b++;
			}
		}
		System.out.println("30���µı����ǣ�"+a+"0.0%");
		System.out.println("30����(��30)�ı����ǣ�"+b+"0.0%");
	}

}
