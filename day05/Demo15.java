package day05;

import java.util.Arrays;

public class Demo15 {
	public static void main(String[] args) {
		// Ñî»ÔÈı½ÇĞÎ
		int[][] arr = new int[7][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i == 0 || j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}

			}
		}

		for (int[] i : arr) {
			System.out.println(Arrays.toString(i));
		}
	}
}
