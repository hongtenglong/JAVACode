package day05;

public class Demo12 {
	public static void main(String[] args) {
		/**将一个数组复制到另一个数组*/
		int [] oldArr = {1,56,2,45,3};
		int [] newArr = new int[oldArr.length];
		
		//1.方法一
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		//2.方法二
		newArr = oldArr.clone();
		
		//3.方法三
		System.arraycopy(oldArr, 0, newArr, 0, 5);
		
		
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		
	}
}
