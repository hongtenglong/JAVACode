package day05;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("������" + (i + 1) + "�� ��" + (j + 1) + "��ѧ���ĳɼ���");
				arr[i][j] = sc.nextInt();
				sum+=arr[i][j];
			}
			System.out.println((i+1)+"��ɼ���Ϊ:"+sum);
		}
	}
}
