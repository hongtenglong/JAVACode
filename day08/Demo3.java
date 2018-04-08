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
			System.out.print("请输入猜测的数字：");
			int a = sc.nextInt();
			if(a<num) {
				System.out.println("猜小了!");
			}else if(a>num) {
				System.out.println("猜大了!");
			}else {
				if(count<=3) {
					System.out.println("太聪明了");
				}else if(count<=5) {
					System.out.println("还阔以");
				}
				break;
			}
		}
		if(count == 5) {
			System.out.println("太笨了");
		}
	}
}
