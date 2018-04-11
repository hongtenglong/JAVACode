package day11.part;
/**
 * 局部内部类    
 * @author Administrator
 *
 */
class Outer{
	
	static int a = 1;
	
	//普通方法
	public void func(){
		//jdk 7及以下:必须使用final修饰
		//jdk 8+:允许直接访问局部变量，但是不能修改值。
		//局部变量
		int a = 2;
		class Inner{
			public void show(){
				System.out.println(a);
			}
		}
		
		Inner inner = new Inner();
		inner.show();
	}
	//静态方法
	public static void func2(){
		class Inner{
			public void show(){
				System.out.println(a);
			}
		}
	}
	
}


public class TestInner {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.func();
	}
}
