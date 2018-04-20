package day18;
/**ʾ����wait�� sleep*/
class ThreadDemo7 implements Runnable{
	int i = 10;
	@Override
	synchronized public void run() {
		for(; i >= 0 ; i--) {
			if(i == 5 && Thread.currentThread().getName().equals("t1")) {
				try {
//					Thread.sleep(1000);
//					wait(1000);
					wait();
					System.out.println("������");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if(i == 0) {
				notify();//���� �ȴ��� �е�����һ���߳�
				//notifyAll();//���� ���� ���߳�
			}
			System.out.println(Thread.currentThread()
					.getName()+": "+i);
		}
	}
}
public class TestThread6 {

	public static void main(String[] args) {
		ThreadDemo7 t = new ThreadDemo7();
		Thread t1 = new Thread(t,"t1");
		Thread t2 = new Thread(t,"t2");
		t1.start();
		t2.start();

	}

}
