package day18.homeWork;

class Apple implements Runnable{
	private int num = 6;
	@Override
	public void run() {
		synchronized(this) {//����������ֵ���һ��
		for (int i = 0; i < 3; i++) {
			num --;
			System.out.println(Thread.currentThread().getName()+"����һ��ƻ������ʣ��"+num+"��ƻ��");
			}
		}
	}
}

public class ZuoYe2 {

	public static void main(String[] args) {
		Apple a = new Apple();
		Thread zhangsan = new Thread(a,"����");
		Thread lisi = new Thread(a,"����");
		zhangsan.currentThread().setPriority(Thread.MAX_PRIORITY);
		lisi.currentThread().setPriority(Thread.MIN_PRIORITY);
		zhangsan.start();
		lisi.start();
	}

}
