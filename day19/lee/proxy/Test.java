package day19.lee.proxy;

public class Test {

	public static void main(String[] args) {
		Person p = new Songzhe(new YifengLee());
		p.play();
	}

}
