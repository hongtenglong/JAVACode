package day06;

public class Demo2 {
	public static void main(String[] args) {
		Math math = new Math();
		math.reversalNum(123456);
		math.isEven(65);
		math.factorial(10);
		math.accumulate(7, 10);
		
	}
}

class Math{
	/**输入一个整数，将次数字反转*/
	public String reversalNum(int num) {
		String a = "";
		while(num!=0) {
			a+=(num%10);
			num/=10;
		}
		System.out.println(a);
		return a;
	}
	
	public boolean isEven(int num) {
		System.out.println(num%2==0?"偶数":"奇数");
		return num%2==0;
	}
	
	public int factorial(int num) {
		int sum = 1;
		while(num>0) {
			System.out.print(num+"*");
			sum*=num;
			num-=1;
		}
		System.out.println("="+sum);
		System.out.println();
		return sum;
	}
	
	public int accumulate(int a,int b) {
		int sum = 0;
		if(a>b) {
			sum = a;
			a = b;
			b = sum;
			sum = 0;
		}
		while(a<b) {
			System.out.print(a+"+");
			sum+=a;
			a++;
		}
		System.out.println("="+sum);
		return sum;
	}
}
