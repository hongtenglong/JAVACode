package day18;

/**ʾ����wait()����������*/
class Qingfeng9{
	private static Qingfeng9 q = new Qingfeng9();
	public int count = 0;//���ӵĸ���
	private boolean tag = false;//�װ� true�а���   falseû�а���
	private Qingfeng9() {}
	public static Qingfeng9 getQingfeng9() {
		return q;
	}
	//����
	synchronized public void put(int count) {
		if(q.tag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//falseû�а���
		q.count = count;//��������
		System.out.println("�����ˣ�"+q.count);
		q.tag = true;//�а�����
		notify();//����������Ա
	}
	//����
	synchronized public void get() {
		if(q.tag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�а���
		System.out.println("���ˣ�"+q.count);
		q.tag = false;//û�а�����
		notify();//���ѳ�ʦ
	}
	
}
//����
class ThreadPut9 implements Runnable{
	Qingfeng9 q = Qingfeng9.getQingfeng9();
	@Override
	public void run() {
		//����
		for(int i = 1; i <= 5; i++) {
			q.put(i);
		}
	}	
}
//����
class ThreadGet9 implements Runnable{
	Qingfeng9 q = Qingfeng9.getQingfeng9();
	@Override
	public void run() {
		//����
		for(int i = 1;i <= 5; i++) {
			q.get();
		}
	}
}
public class Demo9 {
	public static void main(String[] args) {
		ThreadPut9 tp = new ThreadPut9();
		ThreadGet9 tg = new ThreadGet9();
		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tg);
		t1.start();
		t2.start();

	}
}
