package day18;
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i =1 ;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+"数字"+i);
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int  i= 1; i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+":玩游戏");
		}
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
		MyThread t = new MyThread("线程一");
		t.start();
		
		/*MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r);*/
		Thread zhangsan = new Thread(new MyRunnable(),"张三");
		Thread lisi = new Thread(new MyRunnable(),"李四");
		zhangsan.setPriority(Thread.MAX_PRIORITY);
		zhangsan.start();
		lisi.setPriority(Thread.MIN_PRIORITY);
		lisi.start();
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*if(zhangsan.isAlive()||lisi.isAlive()) {
			Thread.sleep(10);
		}*/
		/*try {
			lisi.join();
			zhangsan.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("主线程结束");
	}
}
