package day16;

import java.util.ArrayDeque;
import java.util.Deque;

/**��ϰ������*/
class Person{
	private int no;
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public Person() {
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return no+","+name;
	}
}
public class TestDeque2 {

	public static void main(String[] args) {
		// �����Ŷ�
		Deque<Person> d = new ArrayDeque<>();
		Person p1 = new Person("����");
		Person p2 = new Person("����");
		Person p3 = new Person("����");
		Person p4 = new Person("����");
		Person p5 = new Person("����");
		Person [] pers = {p1,p2,p3,p4,p5};
		
		for(int i = 0; i < pers.length; i ++) {
			pers[i].setNo(i+1);//�Զ����� �����ı��
			d.addLast(pers[i]);//Ԫ�ؼ��� ����
		}
		
		while(d.size() > 0 ) {
			//����
			System.out.println("* "+d.pollFirst()+" �������");
			if(d.size() > 0) {
				d.forEach(System.out::println);
			}else {
				System.out.println("���û�ж�����");
				System.out.println("ȫ���������");
			}
		}
	}

}
