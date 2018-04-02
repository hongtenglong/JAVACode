package day05;

public class Demo6 {
	public static void main(String[] args) {
		int [] a = {1};
		int [] arr = {2,2,3};
		 a[0] = arr[0];
		 arr[0] = 8;
		 System.out.println(a[0]);//½á¹ûÊÇ2
	}
}
