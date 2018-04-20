package day18;

import java.util.concurrent.locks.ReentrantLock;

class XiaoPengYou implements Runnable {
	private long count = 0;
	private ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		while(true) {
			try {
				lock.lock();
				System.out.println(Thread.currentThread().getName() + "\t" + (++count));
				Thread.sleep(20);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				lock.unlock();
			}
		}
	}

}

public class Demo7 {
	public static void main(String[] args) {
		XiaoPengYou x = new XiaoPengYou();
		Thread guojing = new Thread(x, "����");
		Thread yangkang = new Thread(x, "�");
		Thread ouyangke = new Thread(x, "ŷ����");
		Thread zhoubotong = new Thread(x, "�ܲ�ͨ");
		Thread huangrong = new Thread(x, "����");
		guojing.start();
		yangkang.start();
		ouyangke.start();
		zhoubotong.start();
		huangrong.start();
	}
}
