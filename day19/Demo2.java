package day19;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


interface Fruit{
	void show();
}
class Apple implements Fruit{
	public void show() {
		System.out.println("Æ»¹û");
	}
}
class Banana implements Fruit{
	public void show() {
		System.out.println("Ïã½¶");
	}
}
class Person2{
	public void buy(Fruit f) {
		f.show();
	}
}
public class Demo2 {
	public static void main(String[] args) throws Exception {
		Person2 p = new Person2();
		String s = new Util().getProperty("fruit");
		Class<Fruit> f = (Class<Fruit>) Class.forName(s);
		p.buy(f.newInstance());
	}

}
