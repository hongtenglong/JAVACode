package day18;

public class TestMainThread {

	public static void main(String[] args) {
		System.out.println("hello");
		//��� ��ǰ���߳�
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("���߳�");
		System.out.println(Thread.currentThread());
	}

}
