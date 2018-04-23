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
		//1.获取Class对象
		Class clz = Class.forName("com.lee.reflect.Student");
		//读取配置文件(动态创建调用)
		
		//2.通过类名.class(加锁)
		Class clz1 = Student.class;
		
		//3.对象.getClass()  (类的Class对象时唯一的)
		Student stu = new Student();
		Class clz2 = stu.getClass();
		
		
		System.out.println(clz==clz1);
		System.out.println(clz2==clz1);
		
		/*Person p = new Person();
		p.buy(new Orange());
		
		//1.配置文件
		   //1.1 properties(属性文件  key,value)(Properties)
		   //1.2 xml文件 (标签<book></book>) 
		
		//读取配置文件
		Properties pros = new Properties();
		//.properties -流   classloader.getResourceAsStream()
		InputStream is = ReflectTest.class
				.getClassLoader()
				.getResourceAsStream("fruit.properties");
		//加载key/value属性列表
		pros.load(is);
		//根据key获取value
		String fruit = pros.getProperty("fruit");
		is.close();
		
		Person p = new Person();
		Class clz = Class.forName(fruit);   
		//创建对象(调用无参构造)
		Fruit f = (Fruit) clz.newInstance();
		p.buy(f);*/
		
		
	}
	
}
