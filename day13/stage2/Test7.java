package day13.stage2;
abstract class TrafficTool{
	protected int count;//载客量
	
	public TrafficTool(int count) {
		super();
		this.count = count;
	}

	public abstract void transport() ;//运输
}
class Car extends TrafficTool{
	protected int wheelCount;//轮子个数
	public Car(int count,int wheelCount) {
		super(count);
		this.wheelCount = wheelCount;
	}

	@Override
	public void transport() {
		System.out.println("汽车在公路上运输");
	}
	public void brake() {
		System.out.println("汽车刹车");
	}
}
class Truck extends Car{
	private int warehouseCount;//货仓个数
	public Truck(int count, int wheelCount,int warehouseCount) {
		super(count, wheelCount);
		this.warehouseCount = warehouseCount;
	}
	public void pullGoods() {
		System.out.println("汽车拉货");
	}
}
class Bus1 extends Car{
	private int passengerCabinCount;//客舱个数
	public Bus1(int count, int wheelCount,int PassengerCabinCount) {
		super(count, wheelCount);
		this.passengerCabinCount = passengerCabinCount;
	}
	public void broadcasting() {
		System.out.println("公交广播报站");
	}
	
}
interface Fly{
	void fly();
}
class Plane extends TrafficTool{
	private int wing ;//翅膀个数
	public Plane(int count,int wing) {
		super(count);
		this.wing = wing;
	}
	@Override
	public void transport() {
		System.out.println("飞机在空中运输");
	}  
	public void fly1(Fly fly) {
		fly.fly();
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane(20, 2);
		plane.fly1(()->System.out.println("飞机飞行"));
	}

}
