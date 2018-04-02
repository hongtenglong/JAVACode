package day05;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		/** Ã°ÅİÅÅĞò */
		int[] arr = { 96, 126, 23, 258, 45, 55, 64, 3, 47 };
		int a;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
				}
			}
			for (int b : arr) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}
