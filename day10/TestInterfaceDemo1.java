package day10;
interface Info{
//	public final int N = 55;
	int N = 55;//常量
	default void df() {
		System.out.println("default");
	}
	static void sf() {
		System.out.println("static");
	}
}
//实现类  可以 继承 接口中的功能（静态方法除外）
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
