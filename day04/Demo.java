package day04;

public class Demo {

	public static void main(String[] args) {
		char d = 2 +'2';
		System.out.print(d);
		int a = 1;
		int b = 2;
		double sum = 0;
		int c;
		for(int i = 0; i < 10;i++) {
			c = a;
			a = b;
			b = c+b;
			sum+=(a+0.0)/c;
			System.out.print(a+"/"+c+" ");
			//System.out.print(c+"");
		}
		System.out.println();
		System.out.println(sum);
	}

}
