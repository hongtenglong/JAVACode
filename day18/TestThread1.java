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
			System.out.println(Thread.currentThread().getName()+":�����Ϸ");
		}
	}
}
public class TestThread1 {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread zhangsan = new Thread(td,"����");
		
		Thread lisi = new Thread(td,"����");
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
		}//ʧ��ʱ��
*/		
		//isAlive()�ж� �߳��Ƿ� �����У�  ���� true
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
		System.out.println("���߳̽���");*/
		
		
/*		//1.�½�
		MyThread t = new MyThread("�߳�һ");
		//2.����(����һ���߳�)
		t.start();
		*/
	

	}

}
