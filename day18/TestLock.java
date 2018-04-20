package day18;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**ʾ��������*/
class Zhangsan{
	public void say() {
		System.out.println("����˵��������飬�Ҿ͸��㻭");
	}
	public void get() {
		System.out.println("���� �������");
	}
}
class Lisi{
	public void say() {
		System.out.println("���ģ�����һ����Ҿ͸�����");
	}
	public void get() {
		System.out.println("���Ļ���˻�");
	}
}
class ThreadDemo5 implements Runnable{
	private static Zhangsan zhangsan = new Zhangsan();
	private static Lisi lisi = new Lisi();
	public boolean tag = false;
	@Override
	public void run() {
		if(tag == true) {//����
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
		}else {//����
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
