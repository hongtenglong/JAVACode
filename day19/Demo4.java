package day19;
interface Person4{
	void play();
	void swim();
}
class Liyifeng4 implements Person4{

	@Override
	public void play() {
		System.out.println("���׷�����");
		
	}

	@Override
	public void swim() {
		System.out.println("���׷�����Ӿ");
		
	}
}
class Wangbaoqiang implements Person4{

	@Override
	public void play() {
		System.out.println("����ǿ����");
		
	}

	@Override
	public void swim() {
		System.out.println("����ǿ����Ӿ");
	}
}
class Songzhe implements Person4{
	Person4 p;

	@Override
	public void play() {
		System.out.println("����");
		p.play();
		System.out.println("����");
		
	}

	@Override
	public void swim() {
		System.out.println("���·�");
		p.play();
		System.out.println("������");
	}
}
public class Demo4 {

}
