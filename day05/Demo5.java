package day05;

public class Demo5 {
	public static void main(String[] args) {
		/**����һ��5�����������飬������ֵ����������ֵ�������еĵ�һ��Ԫ�ػ���*/
		int [] arr = {56,1,75,456,2};
		int max = arr[0];
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		arr[index] = arr[0];
		arr[0] = max;
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
