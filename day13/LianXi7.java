package day13;
interface Fly{
	void fly();
}  //���� �ܷ�
class Vehicle1{  //��ͨ������
	int busload;//�ؿ���
	public void transport() {
		System.out.println("������");
	}
}
class Car extends Vehicle1{
	int wheelNum;
	public void stop() {
		System.out.println("��ɲ��");
	}
}
class KaChe extends Car{
	String s1 = "�л���";
	public void freight() {
		System.out.println("���˻�");
	}
}
class Bus1 extends Car{
	String s2 = "�пͲ�";
	public void speek() {
		System.out.println("�ܱ�վ");
	}
}

class Plane extends Vehicle1 implements Fly{

	@Override
	public void fly() {
		System.out.println("���ܷ�");
	}
}

public class LianXi7 {
	public static void main(String[] args) {
		Fly f = ()->{System.out.println("�ܷ�");};
		f.fly();
	}
}
