package day19.lee.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Stu1{
	public void show() {
		System.out.println("aa");
	}
}

class Stu2{
	public void show() {
		System.out.println("bb");
	}
}


class Test{
	
	public<T> void show(Class<T> clz){
		try {
			
			Method method = clz.getDeclaredMethod("show");
			T t = clz.newInstance();
			method.invoke(t);
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class ClassTest {

	public static void main(String[] args) {
		Stu1 stu = new Stu1();
		
	}
	
	
	
	

}
