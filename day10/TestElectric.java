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
		System.out.println("��������������������ͨ��ɹ�");
	}
	@Override
	public void service3() {
		System.out.println("�������������繩��ɹ�");
	}
	@Override
	public void serviceSocket() {
		System.out.println("���ŵĹ���");
	}
}
/*class Computer implements Electric3,Electric2{
	@Override
	public void service2() {
		System.out.println("��������������������ͨ��ɹ�");
	}
	@Override
	public void service3() {
		System.out.println("�������������繩��ɹ�");
	}
}*/
/*class IceBox implements Electric3{
	@Override
	public void service3() {
		System.out.println("���������ͨ��");
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
