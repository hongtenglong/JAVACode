package day09;
/**��������*/
class Engine{
	public void start() {
		System.out.println("����������");
	}
	public void stop(){
		System.out.println("������ֹͣ");
	}
}
/**������*/
class Wheel{
	int rongliang;
	public void inflate(int rongliang) {
		System.out.println("������"+(this.rongliang = rongliang));
	}
}

/**������*/
class Window{
	public void roolUp() {
		System.out.println("������");
	}
	public void roolDown() {
		System.out.println("������");
	}
}

/**������*/
class Door{
	Window window = new Window();
	public void open() {
		System.out.println("���ſ�");
	}
	public void close() {
		System.out.println("���Ź�");
	}
	public void roolUp() {
		window.roolUp();
	}
	public void roolDown() {
		window.roolDown();
	}
}

/**������*/
class Car{
	Engine engine = new Engine ();
	Wheel [] wheel = new Wheel [4];
	Door [] door = new Door [4];
	
}



public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
