package day18.homeWork;

class Study implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"˵���ú�ѧϰ����������");
		}
	}
	
}

public class ZuoYe1 {

	public static void main(String[] args) {
		Study s = new Study();
		Thread zhangsan = new Thread(s,"����");
		Thread lisi = new Thread(s,"����");
		zhangsan.currentThread().setPriority(Thread.MAX_PRIORITY);
		lisi.currentThread().setPriority(Thread.MIN_PRIORITY);
		lisi.start();
		zhangsan.start();
		
	}

}
