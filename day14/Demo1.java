package day14;
class Test1{
	private String x;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	
}

class Test2{
	private Double y;

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}
}
class Test3<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class Demo1 {
	public static void main(String[] args) {
		Test3 test = new Test3();
		test.setT("ddddd");
		System.out.println(test.getT());
		
	}
}
