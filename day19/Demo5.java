package day19;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Method5 {
	private int a;
	private String b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	private void show() {
		System.out.println(this.a + this.b);
	}
}

public class Demo5 {

	public static void main(String[] args) throws Exception {
		Class clz = Method5.class;
		Class clz1 = Field.class;
		Method5 me = new Method5();
		Method5 demo = (Method5) clz.newInstance();
		/*
		 * java.lang.reflect.Method[] x = clz.getMethods(); for(java.lang.reflect.Method
		 * a:x) { System.out.println(a); }
		 */
		Method m1 = clz.getMethod("setA", int.class);
		m1.invoke(demo, 2);
		Field field = clz.getDeclaredField("a");
		field.setAccessible(true);
		//field.set(demo, 1);
		
		System.out.println(demo.getA());
		Method m = clz.getDeclaredMethod("show");
		System.out.println(m);
		m.setAccessible(true);
		m.invoke(demo);
	}
}
