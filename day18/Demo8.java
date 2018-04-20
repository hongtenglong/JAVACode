package day18;

/**示例：wait()生产和销售*/
class Qingfeng{
	private int count = 0;//包子的个数
	private boolean tag = false;//白板 true有包子   false没有包子
	//生产
	synchronized public void put(int count) {
		if(tag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//false没有包子
		this.count = count;//生产包子
		System.out.println("生产了："+this.count);
		tag = true;//有包子了
		notify();//唤醒销售人员
	}
	//销售
	synchronized public void get() {
		if(tag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//有包子
		System.out.println("卖了："+this.count);
		tag = false;//没有包子了
		notify();//唤醒厨师
	}
	
}
//生产
class ThreadPut implements Runnable{
	private Qingfeng qingfeng;
	ThreadPut(Qingfeng qingfeng){
		this.qingfeng = qingfeng;
	}
	@Override
	public void run() {
		//生产
		for(int i = 1; i <= 5; i++) {
			qingfeng.put(i);
		}
	}	
}
//销售
class ThreadGet implements Runnable{
	private Qingfeng qingfeng;
	ThreadGet(Qingfeng qingfeng){
		this.qingfeng = qingfeng;
	}
	@Override
	public void run() {
		//销售
		for(int i = 1;i <= 5; i++) {
			qingfeng.get();
		}
	}
}
public class Demo8 {
	public static void main(String[] args) {
		Qingfeng qingfeng = new Qingfeng();//包子铺
		ThreadPut tp = new ThreadPut(qingfeng);
		ThreadGet tg = new ThreadGet(qingfeng);
		Thread t1 = new Thread(tp);
		Thread t2 = new Thread(tg);
		t1.start();
		t2.start();

	}
}
