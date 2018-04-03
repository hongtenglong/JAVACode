package day06.homeWork;

public class ZuoYe07 {
	public static void main(String[] args) {
		Math1 math = new Math1();
		System.out.println(math.add(3, 5));
		System.out.println(math.subtract(3, 5));
		System.out.println(math.multiply(3, 5));
		System.out.println(math.divide(3, 5));
	}
}

class Math1 {
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int subtract(int n1, int n2) {
		return n1 - n2;
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

	public int divide(int n1, int n2) {
		return n1 / n2;
	}
}