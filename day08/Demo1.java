package day08;

public class Demo1 {

	public static void main(String[] args) {
		Child guojing = new Child();
		Child huangrong = new Child();
		Child yangkang = new Child();
		System.out.println("��������һ��");
		guojing.sub();
		System.out.println("��������һ��");
		huangrong.sub();
		System.out.println("�����һ��");
		yangkang.sub();
		System.out.println("��ʣ�£�"+Child.count);
	}
}
class Child{
	static int count = 6;
	public int sub() {
		return count--;
	}
}
