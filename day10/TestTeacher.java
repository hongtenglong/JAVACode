package day10;
//���� ������ 
/**ʾ�������̬*/
class Teacher{
	protected String name;
	public void giveLesson() {
		System.out.println("����ѧ��");
	}
}
//����
class JavaTeacher extends Teacher{
	String tattoo;
	//1
	public void giveLesson() {
		System.out.println(name+"��java��,�����ǣ�"+tattoo);
	}
	public void show() {
		System.out.println("show");
	}
	public void sing() {
		System.out.println("����");
	}
}
class SqlTeacher extends Teacher{
	public void giveLesson() {
		System.out.println(name+"��sql��,�����ǣ�");
	}
	public void dance() {
		System.out.println("����");
	}
}
public class TestTeacher {
	public static void main(String[] args) {
		//2
		Teacher guoxiang = new JavaTeacher();
		guoxiang.name = "����";
//		guoxiang.tattoo = "������";
		guoxiang.giveLesson();
//		guoxiang.sing();
//		guoxiang.show();
		
		Teacher guofu = new SqlTeacher();
		guofu.name = "��ܽ";
		guofu.giveLesson();
//		guofu.dance();
		
		//��̬ ������������֮��Ĳ��죬ֻ�ܵ��ø����ж���Ĺ��������ݡ�
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
