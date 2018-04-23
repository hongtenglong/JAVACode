package day19.lee.reflect;

import java.lang.reflect.Constructor;

class Stu {
	private String name;
	private int age;

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}

}

public class ConstructerTest {

	public static void main(String[] args) throws Exception {
		//Stu stu = new Stu();
		//创建对象
		Class<Stu> clz = Stu.class;
		//Constructor对象
		//获取无参构造
		/*Constructor<Stu> constructor = clz.getConstructor();
		Stu stu = constructor.newInstance();
		System.out.println(stu);*/
		
		Constructor<Stu> constructor = clz.getConstructor(String.class,int.class);
		Stu stu = constructor.newInstance("zs",12);
		System.out.println(stu);
		
		/*clz.getConstructors()
		clz.getDeclaredConstructors()
		clz.getDeclaredConstructor();*/
		
		
	}

}
