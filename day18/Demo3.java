package day18;

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "数字" + i);
			if(i == 3 && Thread.currentThread().getName().equals("t1")) {
				Thread.yield();
				/*try {
					//Thread.sleep(1000);
					Thread.currentThread().join();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("处理异常了");
				}*/
			}
		}
	}

}

public class Demo3 {
	public static void main(String[] args) {
		MyRunnable2 mr = new MyRunnable2();
		Thread t1 = new Thread(mr,"t1");
		Thread t2 = new Thread(mr,"t2");
		t1.start();
		t2.start();
		t1.interrupt();
		
	}
}
