package day10;
/**��ϰ��������̬��Ա���ؼ�*/
//����
abstract class TrafficTool1{
	public abstract void run();
}
//����
class Car1 extends TrafficTool1{
	@Override
	public void run() {
		System.out.println("������ʻ�С���");
	}
}
//����
class Tube extends TrafficTool1{
	public void run() {
		System.out.println("������ʻ�С���");
	}
}
class Employee{
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	//                      ������̬
	public void goHome(TrafficTool1 tool) {
		System.out.println("Ա����"+name+"�ؼ���");
		tool.run();
	}
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee aibiancheng = new Employee("�����");
		Car1 car = new Car1();
		aibiancheng.goHome(car);
		Employee aixuexi = new Employee("��ѧϰ");
		Tube tube = new Tube();
		aixuexi.goHome(tube);

	}

}
