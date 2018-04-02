package day05;

public class Demo8 {
	public static void main(String[] args) {
		/** —°‘Ò≈≈–Ú */
		int[] arr = { 96, 126, 23, 258, 45, 55, 64, 3, 47 };
		int a;
		for (int i =0; i <arr.length-1; i++) {
			for(int j = i +1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
			for (int b : arr) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
