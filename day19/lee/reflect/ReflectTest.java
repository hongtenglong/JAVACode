package day19.lee.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class Student{
	
}

class Apple implements Fruit{

	@Override
	public void show() {
		System.out.println("apple");
	}
}

class Orange implements Fruit{
	private int a;
	public Orange(int a) {
		this.a = a;
	}
	@Override
	public void show() {
		System.out.println("orange");
	}
}

interface Fruit{
	void show();
}

class Person{
	public void buy(Fruit fruit){
		fruit.show();
	}
}
public class ReflectTest {

	public static void main(String[] args) throws Exception {
		//Student stu = new Student();
		//1.��ȡClass����
		Class clz = Class.forName("com.lee.reflect.Student");
		//��ȡ�����ļ�(��̬��������)
		
		//2.ͨ������.class(����)
		Class clz1 = Student.class;
		
		//3.����.getClass()  (���Class����ʱΨһ��)
		Student stu = new Student();
		Class clz2 = stu.getClass();
		
		
		System.out.println(clz==clz1);
		System.out.println(clz2==clz1);
		
		/*Person p = new Person();
		p.buy(new Orange());
		
		//1.�����ļ�
		   //1.1 properties(�����ļ�  key,value)(Properties)
		   //1.2 xml�ļ� (��ǩ<book></book>) 
		
		//��ȡ�����ļ�
		Properties pros = new Properties();
		//.properties -��   classloader.getResourceAsStream()
		InputStream is = ReflectTest.class
				.getClassLoader()
				.getResourceAsStream("fruit.properties");
		//����key/value�����б�
		pros.load(is);
		//����key��ȡvalue
		String fruit = pros.getProperty("fruit");
		is.close();
		
		Person p = new Person();
		Class clz = Class.forName(fruit);   
		//��������(�����޲ι���)
		Fruit f = (Fruit) clz.newInstance();
		p.buy(f);*/
		
		
	}
	
}
