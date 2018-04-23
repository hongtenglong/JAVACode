package day19.lee.proxy;
//����
public class Songzhe implements Person {

	Person p;
	
	public Songzhe(Person p) {
		this.p = p;
	}

	@Override
	public void play() {
		System.out.println("����");
		p.play();
		System.out.println("����");
	}

	@Override
	public void swim() {
		System.out.println("����");
		p.swim();
		System.out.println("����");
	}

}
