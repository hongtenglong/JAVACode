package day11.homeWork;
class Car{
	int seatNum;
	class Wheel{
		String color;
		int num;
		public void show() {
			System.out.println("������"+color+"�ģ���"+num+"������");
		}
	}
	public void show() {
		System.out.println("������λ��"+seatNum+"��");
	}
}

public class ZuoYe1 {
	public static void main(String[] args) {
		Car.Wheel wheel = new Car().new Wheel();
		wheel.color = "��ɫ";
		wheel.num = 4;
		Car car = new Car();
		car.seatNum = 5;
		car.show();
		wheel.show();
	}
}
