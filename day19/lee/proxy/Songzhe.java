package day19.lee.proxy;
//代理
public class Songzhe implements Person {

	Person p;
	
	public Songzhe(Person p) {
		this.p = p;
	}

	@Override
	public void play() {
		System.out.println("热身");
		p.play();
		System.out.println("擦汗");
	}

	@Override
	public void swim() {
		System.out.println("热身");
		p.swim();
		System.out.println("擦汗");
	}

}
