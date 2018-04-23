package day19;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Person6 {
	void play(String s);

	void swim();
}

class Liyifeng6 implements Person6 {

	@Override
	public void play(String s) {
		System.out.println("李易峰在玩"+s);

	}

	@Override
	public void swim() {
		System.out.println("李易峰在游泳");

	}
}

class Wangbaoqiang6 implements Person6 {

	@Override
	public void play(String s) {
		System.out.println("王宝强在玩"+s);

	}

	@Override
	public void swim() {
		System.out.println("王宝强在游泳");
	}
}
public class Demo6 {
	public static void main(String[] args) {
		Person6 person = new Liyifeng6();
		Person6 p = (Person6) Proxy.newProxyInstance(person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new InvocationHandler() {
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println(proxy.getClass().getName());
						System.out.println("热身");
						Object obj = method.invoke(person,args);
						System.out.println("擦汗");
						return null;
					}
				});
		p.play("玩个鸡儿");
		p.swim();
	}
}














