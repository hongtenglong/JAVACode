package day05;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		int[] arr = { 1, 56, 2, 45, 3 };
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要查找的数字：");
		int num = sc.nextInt();
		int index = -1;
		//冒泡排序
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
				}
			}
		}
		
		//二分查找
		int start = 0;
		int end = arr.length -1;
		int middle = (start+end)/2;
		while(arr[middle]!=num) {
			if(num>arr[middle]) {
				start = middle+1;
			}else if(num<arr[middle]) {
				end = middle -1;
			}
			if(start>end) {
				middle = -1;
				break;
			}
				
			middle = (start+end)/2;
		}
		System.out.println(middle);
		
	}
}
