package day10;
interface IA{
	static void sf() {
		System.out.println("IA_sf");
	}
	default void df() {
		System.out.println("IA_df");
	}
	void af();
}
interface IB{
	static void sf() {
		System.out.println("IB_sf");
	}
	default void df() {
		System.out.println("IB_df");
	}
	void af();
}
class DemoImpl implements IA,IB{
	public void show() {
		IA.sf();
		IB.sf();
	}
	//用匿名内部类分别实现----------------------------------------------------
	IA ia = new IA() {
		@Override
		public void af() {
			System.out.println("实现了IA的抽象方法");
		}
	};
	IB ib = new IB() {
		@Override
		public void af() {
			System.out.println("实现了IB的抽象方法");
		}
	};
	//-------------------------------------------------------------------
	@Override
	public void df() {
//		System.out.println("df");
		IA.super.df();//显示调用 父接口中 的 默认方法语法
		IB.super.df();
	}
	@Override
	public void af() {
		System.out.println("实现抽象方法");
	}
}
public class TestInterfaceDemo2 {

	public static void main(String[] args) {
		DemoImpl demo = new DemoImpl();
//		demo.show();
//		demo.df();
//		demo.af();
		demo.ia.af();
		demo.ib.af();
		
	}

}
