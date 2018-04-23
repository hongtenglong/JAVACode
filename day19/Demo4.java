package day19;
interface Person4{
	void play();
	void swim();
}
class Liyifeng4 implements Person4{

	@Override
	public void play() {
		System.out.println("李易峰在玩");
		
	}

	@Override
	public void swim() {
		System.out.println("李易峰在游泳");
		
	}
}
class Wangbaoqiang implements Person4{

	@Override
	public void play() {
		System.out.println("王宝强在玩");
		
	}

	@Override
	public void swim() {
		System.out.println("王宝强在游泳");
	}
}
class Songzhe implements Person4{
	Person4 p;

	@Override
	public void play() {
		System.out.println("热身");
		p.play();
		System.out.println("擦汗");
		
	}

	@Override
	public void swim() {
		System.out.println("脱衣服");
		p.play();
		System.out.println("擦身体");
	}
}
public class Demo4 {

}
