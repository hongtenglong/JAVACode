package day11.homeWork;
class Car{
	int seatNum;
	class Wheel{
		String color;
		int num;
		public void show() {
			System.out.println("车轮是"+color+"的，有"+num+"个车轮");
		}
	}
	public void show() {
		System.out.println("车的座位有"+seatNum+"个");
	}
}

public class ZuoYe1 {
	public static void main(String[] args) {
		Car.Wheel wheel = new Car().new Wheel();
		wheel.color = "粉色";
		wheel.num = 4;
		Car car = new Car();
		car.seatNum = 5;
		car.show();
		wheel.show();
	}
}
