package day08;

public class Demo1 {

	public static void main(String[] args) {
		Child guojing = new Child();
		Child huangrong = new Child();
		Child yangkang = new Child();
		System.out.println("郭靖拿了一个");
		guojing.sub();
		System.out.println("黄蓉拿了一个");
		huangrong.sub();
		System.out.println("杨康拿了一个");
		yangkang.sub();
		System.out.println("还剩下："+Child.count);
	}
}
class Child{
	static int count = 6;
	public int sub() {
		return count--;
	}
}
