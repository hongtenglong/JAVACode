package day07;

public class Demo1 {
	public static void main(String[] args) {
		test t = new test();
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		t.ff(arr,5);
	}
}
class test{
	int num = 1;
	public int f(int n) {
		if(n==0) {
			return 1;
		}
		num *=n;
		f(n-1);
		System.out.print(n+"*");
		return num;
	}
	
	public void ff(int[]arr,int count) {
		if(count==0) {
			return;
		}
		ff(arr,count-1);
		System.out.println(arr[count-1]);
		
		
	}
	
}