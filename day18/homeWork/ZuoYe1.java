package day18.homeWork;

class Study implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+"说：好好学习，天天向上");
		}
	}
	
}

public class ZuoYe1 {

	public static void main(String[] args) {
		Study s = new Study();
		Thread zhangsan = new Thread(s,"张三");
		Thread lisi = new Thread(s,"李四");
		zhangsan.currentThread().setPriority(Thread.MAX_PRIORITY);
		lisi.currentThread().setPriority(Thread.MIN_PRIORITY);
		lisi.start();
		zhangsan.start();
		
	}

}
