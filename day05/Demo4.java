package day05;

public class Demo4 {
	public static void test01(int i) {
		i = 5;
	}

	public static void test02(int[] arr) {
		arr[0] = 5;
	}

	public static void main(String[] args) {
		int i = 3;
		test01(i);
		System.out.println("�����������ͣ�" + i);

		int[] arr = { 1, 2, 3 };
		test02(arr);
		System.out.println("�����������ͣ�" + arr[0]);
	}
}
