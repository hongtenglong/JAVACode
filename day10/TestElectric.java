package day10;
interface Electric3{
//	public abstract void service3();
	void service3();// 
}
interface Electric2{
	void service2();
}
interface Socket extends Electric3,Electric2{
	void serviceSocket();
}
class Goods{}
class Computer extends Goods implements Socket{
	@Override
	public void service2() {
		System.out.println("计算机的外置音箱两项电通电成功");
	}
	@Override
	public void service3() {
		System.out.println("计算机本身三相电供电成功");
	}
	@Override
	public void serviceSocket() {
		System.out.println("插排的供电");
	}
}
/*class Computer implements Electric3,Electric2{
	@Override
	public void service2() {
		System.out.println("计算机的外置音箱两项电通电成功");
	}
	@Override
	public void service3() {
		System.out.println("计算机本身三相电供电成功");
	}
}*/
/*class IceBox implements Electric3{
	@Override
	public void service3() {
		System.out.println("冰箱三相电通电");
	}	
}*/
public class TestElectric {

	public static void main(String[] args) {
		Computer com = new Computer();
		com.service3();
		com.service2();
		com.serviceSocket();
		/*IceBox ice = new IceBox();
		ice.service3();*/

	}

}
