package day18;

/**¡∑œ∞£∫∂‡œﬂ≥Ã*/
class ThreadDemo3 implements Runnable{
	public void showName() {
		System.out.println(Thread.currentThread().getName());
	}
	@Override
	synchronized public void run() {
		for(int i = 1; i <= 20;i ++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			showName();
		}
	}
	
}
public class TestThread3 {

	public static void main(String[] args) {
		ThreadDemo3 td = new ThreadDemo3();
		Thread t1 = new Thread(td,"t1");
		Thread t2 = new Thread(td,"t2");
		t1.start();
		t2.start();
	}

}
