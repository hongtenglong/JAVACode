package day20.test;
class MyThread implements Runnable{
	int i =0;
	@Override
	public void run() {
		
			while(i<20) {
				//notifyAll();
				i=i+1;
				System.out.println(Thread.currentThread().getName());
				try {
					wait(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
	
}
public class Test {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		
		Thread t1 = new Thread(m,"A");
		Thread t2 = new Thread(m,"B");
		t1.start();
		t2.start();
	}
}





