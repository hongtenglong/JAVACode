package day15.homeWork;

import java.util.ArrayList;
import java.util.List;

class Qq{
	private String name;

	public Qq(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Qq [name=" + name + "]";
	}
	
}


public class ZuoYe1 {
	public static void main(String[] args) {
		List<Qq> list = new ArrayList<>();
		list.add(new Qq("��1"));
		list.add(new Qq("��2"));
		list.add(new Qq("��3"));
		list.add(new Qq("��4"));
		list.add(new Qq("��5"));
		list.add(new Qq("��6"));
		list.add(new Qq("��7"));
		list.add(new Qq("��8"));
		list.add(new Qq("��9"));
		System.out.println("�ܹ���"+list.size()+"ֻ���");
		//�������
		list.forEach(System.out::println);
		System.out.println("-----------------------------------------");
		//ɾ������������ֵ��2������Ԫ��
		list.remove(2);
		list.forEach(System.out::println);
	}
}
