package day18;

import java.util.concurrent.locks.ReentrantLock;

/**练习：线程同步，资源共享*/
class ThreadTicket implements Runnable{
	private int ticketCount = 20;
	//可重入 锁 （公平锁）
	private ReentrantLock lock = new ReentrantLock(true);
	public void getTicket() {
		//枷锁
		try {
			lock.lock();
			ticketCount --;
			System.out.println(Thread.currentThread()
					.getName()+"卖了 1 张：余票  "+ticketCount);
			
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}  finally {
			//释放锁
			lock.unlock();
		}
		
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			getTicket();
		}
	}
}
public class TestThrad5 {
	public static void main(String[] args) {
		ThreadTicket t = new ThreadTicket();
		Thread win1 = new Thread(t,"窗口一");
		Thread win2 = new Thread(t,"窗口二");
		win1.start();
		win2.start();
	}
}
