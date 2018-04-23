package day19;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodDemo3{
	private String name;
	private int age;
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
	private void show() {
		System.out.println("aa");
	}
}
public class Demo3 {
	public static void main(String[] args) throws Exception {
		Class clz = MethodDemo3.class;
		Method method = clz.getMethod("setName", String.class);
		MethodDemo3 m = (MethodDemo3) clz.newInstance();
		method.invoke(m, "ÕÅÈý");
		System.out.println(clz.getMethod("getName").invoke(m));
	}
}





