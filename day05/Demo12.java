package day05;

public class Demo12 {
	public static void main(String[] args) {
		/**��һ�����鸴�Ƶ���һ������*/
		int [] oldArr = {1,56,2,45,3};
		int [] newArr = new int[oldArr.length];
		
		//1.����һ
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		//2.������
		newArr = oldArr.clone();
		
		//3.������
		System.arraycopy(oldArr, 0, newArr, 0, 5);
		
		
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		
	}
}
