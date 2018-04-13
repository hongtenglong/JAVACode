package day13;
class Rect{
	private double width;
	private double height;
	public Rect(){
		width = 10;
		height = 10;
	}
	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return (width+height)*2;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
public class LianXi3 {

	public static void main(String[] args) {
		
		Rect r = new Rect(15,20);
		System.out.println("面积是："+r.area());
		System.out.println("周长是："+r.perimeter());
	}

}
