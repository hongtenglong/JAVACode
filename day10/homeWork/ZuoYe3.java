package day10.homeWork;
interface Shape{
	double area();
}
class Triangle implements Shape{
	double height;
	double length;
	public Triangle(double height, double length) {
		super();
		this.height = height;
		this.length = length;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return height*length/2;
	}
}

class Circle implements Shape{
	double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}

public class ZuoYe3 {
	public static void main(String[] args) {
		Triangle t = new Triangle(3, 4);
		Circle c = new Circle(5);
		System.out.println("三角形的面积为"+t.area());
		System.out.println("圆的面积为"+c.area());
	}
}
