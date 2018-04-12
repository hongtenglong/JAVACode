package day11;
@FunctionalInterface
interface I1{
	void test1();
	default void test2() {};
}

public class Demo3 {
	public static void main(String[] args) {
		I1 i =()->{System.out.println("hh");};
		i.test1();
	}
}
