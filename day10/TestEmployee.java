package day10;
/**练习：参数多态：员工回家*/
//父类
abstract class TrafficTool1{
	public abstract void run();
}
//子类
class Car1 extends TrafficTool1{
	@Override
	public void run() {
		System.out.println("汽车行驶中……");
	}
}
//子类
class Tube extends TrafficTool1{
	public void run() {
		System.out.println("地铁行驶中……");
	}
}
class Employee{
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	//                      参数多态
	public void goHome(TrafficTool1 tool) {
		System.out.println("员工："+name+"回家了");
		tool.run();
	}
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee aibiancheng = new Employee("艾编程");
		Car1 car = new Car1();
		aibiancheng.goHome(car);
		Employee aixuexi = new Employee("爱学习");
		Tube tube = new Tube();
		aixuexi.goHome(tube);

	}

}
