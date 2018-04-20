package day18.homeWork;

class Apple implements Runnable{
	private int num = 6;
	@Override
	public void run() {
		synchronized(this) {//三个拿完才轮到下一个
		for (int i = 0; i < 3; i++) {
			num --;
			System.out.println(Thread.currentThread().getName()+"拿了一个苹果，还剩下"+num+"个苹果");
			}
		}
	}
}

public class ZuoYe2 {

	public static void main(String[] args) {
		Apple a = new Apple();
		Thread zhangsan = new Thread(a,"张三");
		Thread lisi = new Thread(a,"李四");
		zhangsan.currentThread().setPriority(Thread.MAX_PRIORITY);
		lisi.currentThread().setPriority(Thread.MIN_PRIORITY);
		zhangsan.start();
		lisi.start();
	}

}
