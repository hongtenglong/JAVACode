package day06;

public class Cat {
	String name;
	String type;
	public void run() {
		System.out.println("�ҿ�ʼ����");
	}
	public void play() {
		System.out.println("�ҿ�ʼ����");
	}
	public String speek() {
		return "�ҽ�"+this.name+",����һֻ"+this.type;
	}
}
