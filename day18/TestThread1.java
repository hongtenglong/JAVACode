package day18;

class MyThread1 extends Thread{
	MyThread1(String name){
		super(name);
	}
	@Override
	public void run() {
		for(int i = 1; i <=  3; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}	
}
class ThreadDemo implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName()+":玩儿游戏");
		}
	}
}
public class TestThread1 {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread zhangsan = new Thread(td,"张三");
		
		Thread lisi = new Thread(td,"李四");
//		zhangsan.setPriority(1);
//		lisi.setPriority(10);
		zhangsan.setPriority(Thread.MIN_PRIORITY);
		zhangsan.setPriority(Thread.MAX_PRIORITY);
		zhangsan.start();
		lisi.start();
		
	/*	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}//失眠时间
*/		
		//isAlive()判断 线程是否 存活（运行）  运行 true
/*		if(zhangsan.isAlive() || lisi.isAlive()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
/*		try {
			zhangsan.join();
			lisi.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("主线程结束");*/
		
		
/*		//1.新建
		MyThread t = new MyThread("线程一");
		//2.就绪(启动一个线程)
		t.start();
		*/
	

	}

}
