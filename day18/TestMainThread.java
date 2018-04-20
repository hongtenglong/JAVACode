package day18;

public class TestMainThread {

	public static void main(String[] args) {
		System.out.println("hello");
		//获得 当前的线程
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("主线程");
		System.out.println(Thread.currentThread());
	}

}
