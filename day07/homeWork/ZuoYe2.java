package day07.homeWork;

public class ZuoYe2 {
	public static void main(String[] args) {
		TrafficTool t = new TrafficTool(100,45);
		t.run();
		t.speedUp(20);
		t.speedDown(40);		
	}
}

class TrafficTool {
	int speed;
	int size;

	public TrafficTool() {

	}

	public TrafficTool(int speed, int size) {
		this.size = size;
		this.speed = speed;
	}

	public void run() {
		System.out.println("���" + size + "�Ľ�ͨ������" + speed + "���ٶ���ʻ");
	}
	
	public void speedUp(int i) {
		this.speed += i;
		run();
	}
	public void speedDown(int i) {
		this.speed -= i;
		run();
	}
}