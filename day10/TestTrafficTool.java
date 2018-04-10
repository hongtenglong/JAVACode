package day10;
/**ʾ����������*/
abstract class TrafficTool{
	private int count;
	public TrafficTool() {}
	public TrafficTool(int count) {
		super();
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public  abstract void run() ;//���󷽷�
}
class Car extends TrafficTool{
	int x;
	public Car(int count,int x) {
		super(count);
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println("�����ڹ�·����ʻ"+getCount());
	}	
}
class Plane extends TrafficTool{
	public Plane(int count) {
		super(count);
	}
	@Override
	public void run() {
		System.out.println("�ɻ�������Ϸ���"+getCount());
	}
	
}
public class TestTrafficTool {
	public static void main(String[] args) {
		Car car = new Car(100,22);
		car.run();

	}

}
