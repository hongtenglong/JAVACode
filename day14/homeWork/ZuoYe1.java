package day14.homeWork;
class Box<T>{
	private T width;
	private T height;
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	
}
public class ZuoYe1 {
	public static void main(String[] args) {
		Box<Integer> z1 = new Box<Integer>();
		z1.setHeight(45);
		z1.setWidth(40);
		Box<Double> z2 = new Box<Double>();
		z2.setHeight(45.2);
		z2.setWidth(40.2);
		Box<String> z3 = new Box<String>();
		z3.setHeight("5m");
		z3.setWidth("3m");
		
		
	}
}
