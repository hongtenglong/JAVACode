package day18;
/**示例：wait和 sleep*/
class ThreadDemo7 implements Runnable{
	int i = 10;
	@Override
	synchronized public void run() {
		for(; i >= 0 ; i--) {
			if(i == 5 && Thread.currentThread().getName().equals("t1")) {
				try {
//					Thread.sleep(1000);
//					wait(1000);
					wait();
					System.out.println("我醒了");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(i == 0) {
				notify();//唤醒 等待池 中的任意一个线程
				//notifyAll();//唤醒 所有 的线程
			}
			System.out.println(Thread.currentThread()
					.getName()+": "+i);
		}
	}
}
public class TestThread6 {

	public static void main(String[] args) {
		ThreadDemo7 t = new ThreadDemo7();
		Thread t1 = new Thread(t,"t1");
		Thread t2 = new Thread(t,"t2");
		t1.start();
		t2.start();

	}

}
