package day20;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class YifengLee1{
	public void play() {
		System.out.println("���׷�����");

	}
	public void swim() {
		System.out.println("���׷�����Ӿ");

	}
}
public class Demo1 {
	public static void main(String[] args) {
		YifengLee1 yi = new YifengLee1();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(YifengLee1.class);
		//������ʵ�ִ�������ÿһ��Ŀ�귽����
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				System.out.println("����");
				Object obj = method.invoke(yi, args);
				System.out.println("����");
				System.out.println("-------------------");
				methodProxy.invokeSuper(proxy, args);
				System.out.println("-------------------");
				return obj;
			}
		});
		//�����������
		YifengLee1 yiLee = (YifengLee1) enhancer.create();
		yiLee.play();
		yiLee.swim();
	}

}
