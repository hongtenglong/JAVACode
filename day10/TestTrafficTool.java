package day10;
/**示例：抽象类*/
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
	public  abstract void run() ;//抽象方法
}
class Car extends TrafficTool{
	int x;
	public Car(int count,int x) {
		super(count);
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println("汽车在公路上行驶"+getCount());
	}	
}
class Plane extends TrafficTool{
	public Plane(int count) {
		super(count);
	}
	@Override
	public void run() {
		System.out.println("飞机在天空上飞行"+getCount());
	}
	
}
public class TestTrafficTool {
	public static void main(String[] args) {
		Car car = new Car(100,22);
		car.run();

	}

}
