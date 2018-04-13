package day13;
interface Fly{
	void fly();
}  //功能 能飞
class Vehicle1{  //交通工具类
	int busload;//载客量
	public void transport() {
		System.out.println("能运输");
	}
}
class Car extends Vehicle1{
	int wheelNum;
	public void stop() {
		System.out.println("能刹车");
	}
}
class KaChe extends Car{
	String s1 = "有货仓";
	public void freight() {
		System.out.println("能运货");
	}
}
class Bus1 extends Car{
	String s2 = "有客舱";
	public void speek() {
		System.out.println("能报站");
	}
}

class Plane extends Vehicle1 implements Fly{

	@Override
	public void fly() {
		System.out.println("我能飞");
	}
}

public class LianXi7 {
	public static void main(String[] args) {
		Fly f = ()->{System.out.println("能飞");};
		f.fly();
	}
}
