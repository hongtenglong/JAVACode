package day06.homeWork;

public class ZuoYe04 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.getArea();
		c.getPerimeter();
	}
	
}

class Circle{
	int r = 3;
	public void getArea() {
		double area = Math.PI*r*r;
		System.out.println("面积为："+area);
	}
	
	public void getPerimeter() {
		double perimeter = 2*Math.PI*r;
		System.out.println("周长为："+perimeter);
	}
}