package day10.homeWork;
interface IFly{
	public abstract void fly();
}

class Plane implements IFly{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("���Ƿɻ���������������ʹ�ø߿Ƽ�����");
	}
}
class Spadger implements IFly{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("������ȸ�����г����ɫ����");
	}
	
}

public class ZuoYe2 {
	public static void main(String[] args) {
		Plane p = new Plane();
		p.fly();
		Spadger s = new Spadger();
		s.fly();
	}
}
