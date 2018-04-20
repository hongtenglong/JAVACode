package day18;

import java.util.concurrent.locks.ReentrantLock;

class MaiPiao implements Runnable {
	private int num = 20;
	private ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			/*synchronized (this) {
				num--;
				System.out.println(Thread.currentThread().getName() 
						+ "卖出去了1张票，还剩：" + num + "张票");
			}*/
			try {
				lock.lock();
				num--;
				System.out.println(Thread.currentThread().getName() 
						+ "卖出去了1张票，还剩：" + num + "张票");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
			
		}
	}

}

public class Demo6 {
	public static void main(String[] args) {
		MaiPiao m = new MaiPiao();
		Thread t1 = new Thread(m,"窗口1");
		Thread t2 = new Thread(m,"窗口2");
		t1.start();
		t2.start();
	}
}
