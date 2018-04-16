package day14;

class ZuoBiao<T> {
	private T x;
	private T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x = "+ x + ", y = " + y;
	}

}

public class Demo2 {
	public static void main(String[] args) {
		ZuoBiao<Integer> z1 = new ZuoBiao();
		z1.setX(10);
		z1.setY(20);
		System.out.println(z1);
		
		ZuoBiao<Double> z2 = new ZuoBiao();
		z2.setX(10.5);
		z2.setY(20.6);
		System.out.println(z2);
		
		
		ZuoBiao<String> z3 = new ZuoBiao();
		z3.setX("东京180度");
		z3.setY("北纬210度");
		System.out.println(z3);
	}
}
