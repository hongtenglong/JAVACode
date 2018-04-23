package day19.lee.dynproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		//目标对象
		Person person = new YifengLee();
		//在运行阶段，动态创建目标对象的代理对象(给每个目标方法添加代理方法)
			//类加载器
			//目标类实现的所有的接口列表(获取所有方法)
			//InvocationHandler:
				//执行每一个方法(代理方法   目标方法)
		//JDK动态代理 (接口+实现类)
		//cglib动态代理 (实现类)  cglib.jar
		Person p = (Person) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new InvocationHandler() {
					//proxy  代理对象
					//method:目标方法的描述对象
					//args:目标方法的参数
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("热身");
						//手动调用目标方法(返回值)
						Object obj = method.invoke(person, args);
						System.out.println("擦汗");
						return obj;
					}
				});
		p.play();
		p.swim();
	}

}
