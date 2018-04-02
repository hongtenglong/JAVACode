package day05;

public class Demo3 {
	public static void main(String[] args) {
		int n1 = 55;
		int n2 = 66;
		n1 = n2;
		System.out.println(n1);
		n2 = 77;
		System.out.println(n1);
		
		
		//栈内存  存的是数组的引用 不是数组的值
		
		
		int [] arr1 = {55};
		int [] arr2 = {66};
		arr1 = arr2;
		System.out.println(arr1[0]);
		arr2[0] = 77;
		System.out.println(arr1[0]);
	}
}
