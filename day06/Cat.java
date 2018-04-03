package day06;

public class Cat {
	String name;
	String type;
	public void run() {
		System.out.println("我开始跑了");
	}
	public void play() {
		System.out.println("我开始玩了");
	}
	public String speek() {
		return "我叫"+this.name+",我是一只"+this.type;
	}
}
