package day18;

class MyRunnable4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=20;i++) {
			System.out.println(Thread.currentThread().getName()+"   "+i+"次");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}


public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable4 mr = new MyRunnable4();
		Thread t1 = new Thread(mr,"1线程");
		Thread t2 = new Thread(mr,"2线程");
		t1.start();
		t1.join();
		t2.start();
	}
}
