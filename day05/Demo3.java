package day05;

public class Demo3 {
	public static void main(String[] args) {
		int n1 = 55;
		int n2 = 66;
		n1 = n2;
		System.out.println(n1);
		n2 = 77;
		System.out.println(n1);
		
		
		//ջ�ڴ�  �������������� ���������ֵ
		
		
		int [] arr1 = {55};
		int [] arr2 = {66};
		arr1 = arr2;
		System.out.println(arr1[0]);
		arr2[0] = 77;
		System.out.println(arr1[0]);
	}
}
