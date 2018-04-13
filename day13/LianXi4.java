package day13;

interface Vehicle{
	void start(String name);
	void stop(String name);
}

class Bike implements Vehicle{
	@Override
	public void start(String name) {
		System.out.println(name+"���г�start��");
	}
	@Override
	public void stop(String name) {
		System.out.println(name+"���г�stop��");
	}
	
}
class Bus implements Vehicle{
	@Override
	public void start(String name) {
		System.out.println(name+"������start��");
	}
	@Override
	public void stop(String name) {
		System.out.println(name+"������stop��");
	}
	
}

public class LianXi4 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.start("��ɫ��");
		bike.stop("��ɫ��");
		Bus bus = new Bus();
		bus.start("��ɫ��");
		bus.stop("��ɫ��");
	

	}

}
