package day10;
interface Info{
//	public final int N = 55;
	int N = 55;//����
	default void df() {
		System.out.println("default");
	}
	static void sf() {
		System.out.println("static");
	}
}
//ʵ����  ���� �̳� �ӿ��еĹ��ܣ���̬�������⣩
class InfoImpl implements Info{
	public void show() {
		System.out.println(N);
		df();
		Info.sf();
	}
}
public class TestInterfaceDemo1 {

	public static void main(String[] args) {
		InfoImpl impl = new InfoImpl();
		impl.show();
		impl.df();

	}

}
