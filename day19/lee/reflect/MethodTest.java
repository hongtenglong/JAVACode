package day19.lee.reflect;

import java.lang.reflect.Method;

class MethodDemo{
	private String name;
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void show(){
		System.out.println("name="+name);
	}
}

public class MethodTest {

	public static void main(String[] args) throws Exception {
		/*MethodDemo demo = new MethodDemo();
		demo.setName("aaa");*/
		
		
		//2.获取method的对象
		/*Method[] methods = clz.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}*/
		/*Method[] declaredMethods = clz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}*/
		/*Method method = clz.getMethod("setName", String.class);
		System.out.println(method);*/
		
		/*Method m2 = clz.getDeclaredMethod("show");
		//执行方法(对象  参数)
		m2.setAccessible(true);
		m2.invoke(clz.newInstance());*/
		
		
		//1.获取Class对象
		/*Class clz = MethodDemo.class;
		MethodDemo demo  = (MethodDemo) clz.newInstance();
		//2.setname方法 (传入参数)   方法名      参数类型的Class对象
		Method method = clz.getMethod("setName",String.class);
		//调用方法（对象    参数）
		method.invoke(demo,"aa");
		
		//3.调用show方法
		Method m = clz.getDeclaredMethod("show");
		m.setAccessible(true);
		Object obj = m.invoke(demo);*/
		
		
		
		
	}

}
