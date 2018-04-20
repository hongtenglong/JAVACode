package day18;

/**ʾ����wait()����������*/
class Qingfeng{
	private int count = 0;//���ӵĸ���
	private boolean tag = false;//�װ� true�а���   falseû�а���
	//����
	synchronized public void put(int count) {
		if(tag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//falseû�а���
		this.count = count;//��������
		System.out.println("�����ˣ�"+this.count);
		tag = true;//�а�����
		notify();//����������Ա
	}
	//����
	synchronized public void get() {
		if(tag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//�а���
		System.out.println("���ˣ�"+this.count);
		tag = false;//û�а�����
		notify();//���ѳ�ʦ
	}
	
}
//����
class ThreadPut implements Runnable{
	private Qingfeng qingfeng;
	ThreadPut(Qingfeng qingfeng){
		this.qingfeng = qingfeng;
	}
	@Override
	public void run() {
		//����
		for(int i = 1; i <= 5; i++) {
			qingfeng.put(i);
		}
	}	
}
//����
class ThreadGet implements Runnable{
	private Qingfeng qingfeng;
	ThreadGet(Qingfeng qingfeng){
		this.qingfeng = qingfeng;
	}
	@Override
	public void run() {
		//����
		for(int i = 1;i <= 5; i++) {
			qingfeng.get();
		}
	}
}
public class Demo8 {
	public static void main(String[] args) {
		Qingfeng qingfeng = new Qingfeng();//������
		ThreadPut tp = new ThreadPut(qingfeng);
		ThreadGet tg = new ThreadGet(qingfeng);
		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tg);
		t1.start();
		t2.start();

	}
}
