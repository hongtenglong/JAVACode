package day05;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr = { 1, 56, 2, 45, 3 };
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ���ҵ����֣�");
		int num = sc.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				index = i+1;
				break;
			}
		}
		
		System.out.println("λ�ã�"+index);
	}
}
