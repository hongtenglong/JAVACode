package day18;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**示例：死锁*/
class Zhangsan{
	public void say() {
		System.out.println("张三说：你给我书，我就给你画");
	}
	public void get() {
		System.out.println("张三 获得了书");
	}
}
class Lisi{
	public void say() {
		System.out.println("李四：你给我画，我就给你书");
	}
	public void get() {
		System.out.println("李四获得了画");
	}
}
class ThreadDemo5 implements Runnable{
	private static Zhangsan zhangsan = new Zhangsan();
	private static Lisi lisi = new Lisi();
	public boolean tag = false;
	@Override
	public void run() {
		if(tag == true) {//张三
			synchronized (zhangsan) {
				zhangsan.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				synchronized (lisi) {
					zhangsan.get();
				}
			}
		}else {//李四
			synchronized (lisi) {
				lisi.say();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (zhangsan) {
					lisi.get();
				}
			}
		}
		
	}
	
}
public class TestLock {
	public static void main(String[] args) {
		ThreadDemo5 td1 = new ThreadDemo5();
		td1.tag = true;
		ThreadDemo5 td2 = new ThreadDemo5();
		td2.tag = false;
		Thread t1 = new Thread(td1);
		Thread t2 = new Thread(td2);
		t1.start();
		t2.start();

	}

}
