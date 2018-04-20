package day18;

import java.util.concurrent.locks.ReentrantLock;

/**��ϰ���߳�ͬ������Դ����*/
class ThreadTicket implements Runnable{
	private int ticketCount = 20;
	//������ �� ����ƽ����
	private ReentrantLock lock = new ReentrantLock(true);
	public void getTicket() {
		//����
		try {
			lock.lock();
			ticketCount --;
			System.out.println(Thread.currentThread()
					.getName()+"���� 1 �ţ���Ʊ  "+ticketCount);
			
		}catch(Exception e ){
			System.out.println(e.getMessage());
		}  finally {
			//�ͷ���
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
		Thread win1 = new Thread(t,"����һ");
		Thread win2 = new Thread(t,"���ڶ�");
		win1.start();
		win2.start();
	}
}
