package day13.stage2;
class Rect{
	protected double width;
	protected double height;
	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rect() {
		this.width = 10;
		this.height = 10;
	}
	public void area() {
		System.out.println("面积："+width*height);
	}
	public void perimeter() {
		System.out.println("周长："+2*(width+height));
	}
}
public class Test3 {

	public static void main(String[] args) {
		Rect r = new Rect();
		r.area();
		r.perimeter();
		
	}

}
