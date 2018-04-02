package day05;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		int [] arr = new int[] {1,2,3,4,5};
		System.out.print("加密前:");
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			arr[i] = arr[i]+2;
		}
		
		System.out.print("\n加密后:");
		for(int i = 0 ;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
