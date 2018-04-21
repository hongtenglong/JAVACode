package day18.lianxi;

class Circle2{
	private double radius;
	public Circle2() {
		radius = 0;
	}
	public Circle2(double r) {
		radius = r;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void show() {		
		System.out.println("�뾶Ϊ��"+radius);
		System.out.println("���Ϊ��"+getArea());
		System.out.println("�ܳ�Ϊ��"+getPerimeter());
	}
}

public class LianXi2 {
	public static void main(String[] args) {
		Circle2 c = new Circle2(4);
		c.show();
	}

}
