package day20;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

class YifengLee1{
	public void play() {
		System.out.println("李易峰在玩");

	}
	public void swim() {
		System.out.println("李易峰在游泳");

	}
}
public class Demo1 {
	public static void main(String[] args) {
		YifengLee1 yi = new YifengLee1();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(YifengLee1.class);
		//代理方法实现处理（拦截每一个目标方法）
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				System.out.println("热身");
				Object obj = method.invoke(yi, args);
				System.out.println("擦汗");
				System.out.println("-------------------");
				methodProxy.invokeSuper(proxy, args);
				System.out.println("-------------------");
				return obj;
			}
		});
		//创建代理对象
		YifengLee1 yiLee = (YifengLee1) enhancer.create();
		yiLee.play();
		yiLee.swim();
	}

}
