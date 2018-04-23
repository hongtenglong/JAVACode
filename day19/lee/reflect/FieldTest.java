package day19.lee.reflect;

import java.lang.reflect.Field;

class FieldDemo{
	
	private int no;
	private String name;
	
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
	
	
	
}

public class FieldTest {

	public static void main(String[] args) throws Exception {
		//1.�鿴FieldDemo��������е�����
		Class clz = FieldDemo.class;
		
		//2.�鿴����
		/*Field[] fields = clz.getFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}*/
		/*Field[] fields = clz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}*/
		//��ȡָ������
		/*Field field = clz.getField("no");
		System.out.println(field);*/
		/*Field field = clz.getDeclaredField("no");
		System.out.println(field);*/
		
		/*FieldDemo demo = new FieldDemo();
		demo.setNo(1);
		System.out.println(demo.getNo());*/
		
		FieldDemo demo = new FieldDemo();
		Field field = clz.getDeclaredField("no");
		//��ֵ(����   ֵ) 
		//���÷���Ȩ��
		field.setAccessible(true);
		//����ֵ
		//field.setInt(demo, 1);
		field.set(demo, 1);
		//��ȡ�����������͵�ֵ
		System.out.println(field.getInt(demo));
		//System.out.println(demo.getNo());
		
		
	}

}
