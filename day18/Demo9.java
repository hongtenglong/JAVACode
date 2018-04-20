package day18;

/**示例：wait()生产和销售*/
class Qingfeng9{
	private static Qingfeng9 q = new Qingfeng9();
	public int count = 0;//包子的个数
	private boolean tag = false;//白板 true有包子   false没有包子
	private Qingfeng9() {}
	public static Qingfeng9 getQingfeng9() {
		return q;
	}
	//生产
	synchronized public void put(int count) {
		if(q.tag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//false没有包子
		q.count = count;//生产包子
		System.out.println("生产了："+q.count);
		q.tag = true;//有包子了
		notify();//唤醒销售人员
	}
	//销售
	synchronized public void get() {
		if(q.tag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//有包子
		System.out.println("卖了："+q.count);
		q.tag = false;//没有包子了
		notify();//唤醒厨师
	}
	
}
//生产
class ThreadPut9 implements Runnable{
	Qingfeng9 q = Qingfeng9.getQingfeng9();
	@Override
	public void run() {
		//生产
		for(int i = 1; i <= 5; i++) {
			q.put(i);
		}
	}	
}
//销售
class ThreadGet9 implements Runnable{
	Qingfeng9 q = Qingfeng9.getQingfeng9();
	@Override
	public void run() {
		//销售
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
