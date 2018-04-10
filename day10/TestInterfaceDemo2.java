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
	//�������ڲ���ֱ�ʵ��----------------------------------------------------
	IA ia = new IA() {
		@Override
		public void af() {
			System.out.println("ʵ����IA�ĳ��󷽷�");
		}
	};
	IB ib = new IB() {
		@Override
		public void af() {
			System.out.println("ʵ����IB�ĳ��󷽷�");
		}
	};
	//-------------------------------------------------------------------
	@Override
	public void df() {
//		System.out.println("df");
		IA.super.df();//��ʾ���� ���ӿ��� �� Ĭ�Ϸ����﷨
		IB.super.df();
	}
	@Override
	public void af() {
		System.out.println("ʵ�ֳ��󷽷�");
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
