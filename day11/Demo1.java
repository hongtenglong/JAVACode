package day11;

class Outer{
	int a = 1;
	public void show() {
		final int a = 2;
		class Inner{
			public void func1() {
				System.out.println(a);
			}
		}
		Inner i = new Inner();
		i.func1();
	}
}


public class Demo1 {
	public static void main(String[] args) {
//		Outer.Inner inner = new Outer().new Inner();
//		inner.show();
		Outer o = new Outer();
		o.show();
	}
}
