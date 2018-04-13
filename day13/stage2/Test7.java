package day13.stage2;
abstract class TrafficTool{
	protected int count;//�ؿ���
	
	public TrafficTool(int count) {
		super();
		this.count = count;
	}

	public abstract void transport() ;//����
}
class Car extends TrafficTool{
	protected int wheelCount;//���Ӹ���
	public Car(int count,int wheelCount) {
		super(count);
		this.wheelCount = wheelCount;
	}

	@Override
	public void transport() {
		System.out.println("�����ڹ�·������");
	}
	public void brake() {
		System.out.println("����ɲ��");
	}
}
class Truck extends Car{
	private int warehouseCount;//���ָ���
	public Truck(int count, int wheelCount,int warehouseCount) {
		super(count, wheelCount);
		this.warehouseCount = warehouseCount;
	}
	public void pullGoods() {
		System.out.println("��������");
	}
}
class Bus1 extends Car{
	private int passengerCabinCount;//�Ͳո���
	public Bus1(int count, int wheelCount,int PassengerCabinCount) {
		super(count, wheelCount);
		this.passengerCabinCount = passengerCabinCount;
	}
	public void broadcasting() {
		System.out.println("�����㲥��վ");
	}
	
}
interface Fly{
	void fly();
}
class Plane extends TrafficTool{
	private int wing ;//������
	public Plane(int count,int wing) {
		super(count);
		this.wing = wing;
	}
	@Override
	public void transport() {
		System.out.println("�ɻ��ڿ�������");
	}  
	public void fly1(Fly fly) {
		fly.fly();
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane(20, 2);
		plane.fly1(()->System.out.println("�ɻ�����"));
	}

}
