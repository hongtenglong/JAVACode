package day11.instance;


/**
 * 实例成员内部类
 * @author Administrator
 *
 * static修饰变量是类变量
 * 修饰方法是类方法
 * 
 */
class Outer {
	
	int a = 1;
	
	public static void show(){
		/*Inner inner = new Inner();
		System.out.println(inner.b);*/
		
	}
	
	class Inner{
		
		int b = 2;
		
		int a = 2;
		
		public void show(){
			System.out.println(Outer.this.a);
		}
		
	}
	
}

public class TestInner{
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		//创建内部类对象
		/*Outer.Inner  inner = new Outer().new Inner();
		inner.show();*/
	}
}


