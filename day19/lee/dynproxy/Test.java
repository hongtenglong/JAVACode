package day19.lee.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//Ŀ�����
		Person person = new YifengLee();
		//�����н׶Σ���̬����Ŀ�����Ĵ������(��ÿ��Ŀ�귽����Ӵ�����)
			//�������
			//Ŀ����ʵ�ֵ����еĽӿ��б�(��ȡ���з���)
			//InvocationHandler:
				//ִ��ÿһ������(������   Ŀ�귽��)
		//JDK��̬���� (�ӿ�+ʵ����)
		//cglib��̬���� (ʵ����)  cglib.jar
		Person p = (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new InvocationHandler() {
					//proxy  �������
					//method:Ŀ�귽������������
					//args:Ŀ�귽���Ĳ���
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("����");
						//�ֶ�����Ŀ�귽��(����ֵ)
						Object obj = method.invoke(person, args);
						System.out.println("����");
						return obj;
					}
				});
		p.play();
		p.swim();
	}

}
