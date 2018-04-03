package day06.homeWork;

public class ZuoYe08 {
	public static void main(String[] args) {
		Math2 math = new Math2();
		System.out.println(math.calculation(3, 5, "*"));
	}
}

class Math2 {
	public int calculation(int n1, int n2, String operator) {
		switch(operator){
		case "+":
			return add(n1,n2);
		case "-":
			return subtract(n1,n2);
		case "*":
			return multiply(n1,n2);
		case "/":
			return divide(n1,n2);
		default:
			return 0;
		}
	}

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