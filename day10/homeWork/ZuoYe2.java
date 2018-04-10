package day10.homeWork;
interface IFly{
	public abstract void fly();
}

class Plane implements IFly{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我是飞机，我有助推器，使用高科技飞行");
	}
}
class Spadger implements IFly{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("我是麻雀，我有翅膀，绿色出行");
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
