package day09;
/**发动机类*/
class Engine{
	public void start() {
		System.out.println("发动机启动");
	}
	public void stop(){
		System.out.println("发动机停止");
	}
}
/**轮子类*/
class Wheel{
	int rongliang;
	public void inflate(int rongliang) {
		System.out.println("充气："+(this.rongliang = rongliang));
	}
}

/**车窗类*/
class Window{
	public void roolUp() {
		System.out.println("车窗升");
	}
	public void roolDown() {
		System.out.println("车窗降");
	}
}

/**车门类*/
class Door{
	Window window = new Window();
	public void open() {
		System.out.println("车门开");
	}
	public void close() {
		System.out.println("车门关");
	}
	public void roolUp() {
		window.roolUp();
	}
	public void roolDown() {
		window.roolDown();
	}
}

/**汽车类*/
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
