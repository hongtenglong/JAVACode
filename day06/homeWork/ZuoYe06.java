package day06.homeWork;

public class ZuoYe06 {
	public static void main(String[] args) {
		PassObject p = new PassObject();
		p.printAreas(new Circle2(), 5);
	}
	
}

class Circle2{
	double redius ;
	public double findArea() {
		return Math.PI*redius*redius;
	}
}
class PassObject{
	public void printAreas(Circle2 c,int time){
		System.out.println("Radius\tArea");
		for (int i = 1; i <= time; i++) {
			c.redius = i;
			System.out.println(i+0.0+"\t"+c.findArea());
		}
	}
}