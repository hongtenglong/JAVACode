package day06.homeWork;

public class ZuoYe01 {
	public static void main(String[] args) {
		Mouse mouse1 = new Mouse();
		mouse1.name = "����";
		mouse1.hobby = "��";
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
		System.out.println("�ҽ�" + name + "���Ұ�����" + hobby + "��һֻСè����ɶ���¡�");
	}
}
