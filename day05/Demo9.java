package day05;

public class Demo9 {
	public static void main(String[] args) {
		/** ²åÈëÅÅĞò */
		int[] arr = { 96, 126, 23, 258, 45, 55, 64, 3, 47 };
					//23, 96, 126,258, 45, 55, 64, 3, 47 
		int a;
		for (int i = 1; i < arr.length; i++) {
			c:
			for (int j = 0; j < i; j++) {
				if(arr[i]<arr[j]) {
					a = arr[i];
					for(int k = i; k>j;k--) {
						arr[k] = arr[k-1];
					}
					arr[j] = a;
					break c;
				}
				
			}
			//±éÀúÊä³ö
			
		}
		for (int b : arr) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
}
