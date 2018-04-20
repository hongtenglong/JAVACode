package day18;
class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i == 3 && Thread.currentThread().getName().equals("t1")) {
				Thread.yield();//让步 t2
//				try {
////					Thread.sleep(1000);
////					Thread.currentThread().join();
//					
//				} catch (InterruptedException e) {
//					System.out.println("处理异常了");
//				}
			}
		}
	}
}
public class TestThread2 {

	public static void main(String[] args) {
		ThreadDemo2 td = new ThreadDemo2();
		Thread t1 = new Thread(td,"t1");
		Thread t2 = new Thread(td,"t2");
		/*
		 * 同等优先级 ，让给 相同优先级的线程
		 * 不同优先级 ，让给 优先级高的线程
		 */
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
//		t1.interrupt();//
		
		

	}

}
