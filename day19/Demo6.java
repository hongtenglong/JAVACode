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
		System.out.println("���׷�����"+s);

	}

	@Override
	public void swim() {
		System.out.println("���׷�����Ӿ");

	}
}

class Wangbaoqiang6 implements Person6 {

	@Override
	public void play(String s) {
		System.out.println("����ǿ����"+s);

	}

	@Override
	public void swim() {
		System.out.println("����ǿ����Ӿ");
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
						System.out.println("����");
						Object obj = method.invoke(person,args);
						System.out.println("����");
						return null;
					}
				});
		p.play("�������");
		p.swim();
	}
}














