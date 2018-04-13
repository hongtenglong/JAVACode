package day13;

interface Vehicle{
	void start(String name);
	void stop(String name);
}

class Bike implements Vehicle{
	@Override
	public void start(String name) {
		System.out.println(name+"自行车start了");
	}
	@Override
	public void stop(String name) {
		System.out.println(name+"自行车stop了");
	}
	
}
class Bus implements Vehicle{
	@Override
	public void start(String name) {
		System.out.println(name+"公交车start了");
	}
	@Override
	public void stop(String name) {
		System.out.println(name+"公交车stop了");
	}
	
}

public class LianXi4 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start("黄色的");
		bike.stop("黄色的");
		Bus bus = new Bus();
		bus.start("绿色的");
		bus.stop("绿色的");
	

	}

}
