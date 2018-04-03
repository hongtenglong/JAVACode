package day06.homeWork;

public class ZuoYe01 {
	public static void main(String[] args) {
		Mouse mouse1 = new Mouse();
		mouse1.name = "杰瑞";
		mouse1.hobby = "吃";
		mouse1.show();
		
		Mouse mouse2 = new Mouse();
		mouse2.name="tomcat";
		mouse2.hobby = "run";
		mouse2.show();
	}
}
class Mouse {
	String name;
	String hobby;

	public void show() {
		System.out.println("我叫" + name + "，我爱好是" + hobby + "，一只小猫，有啥可怕。");
	}
}
