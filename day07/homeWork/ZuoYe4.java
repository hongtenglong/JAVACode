package day07.homeWork;

public class ZuoYe4 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.f(5, 6));
		System.out.println(d.f(5.1,5.2));
		System.out.println(d.f(5.1, 6.2,4.6));
	}
}

class Demo{
	public int f(int a, int b) {
		return a>b?a:b;
	}
	public double f(double a,double b) {
		return a>b?a:b;
	}
	public double f(double a,double b,double c) {
		return a>b?(a>c?a:c):(b>c?b:c);
	}
}