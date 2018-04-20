package day18;
/**示例：存钱*/
/*class Bank implements Runnable{
	private int money = 0;//余额
	//存钱 
	public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"存了100，余额："+money);
	}
	//this
	synchronized public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"存了100，余额："+money);
	}
	public void run() {
		for(int i = 1; i <= 3 ;i++) {
			//同步代码块
			synchronized (this) {
				setMoney();
			}
		}
	}
}*/
class Bank extends Thread{
	Bank(String name){
		super(name);
	}
	private int money = 0;//余额
	//存钱 
	//this
	synchronized public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"存了100，余额："+money);
	}
	public void run() {
		for(int i = 1; i <= 3 ;i++) {
				setMoney();
		}
	}
}
public class TestThread4 {
	public static void main(String[] args) {
		Bank t1 = new Bank("张三");
		Bank t2 = new Bank("李四");
		t1.start();
		t2.start();
		
/*		Bank bank = new Bank();
//		Bank bank1 = new Bank();
		Thread zhangsan = new Thread(bank,"张三");
		Thread lisi = new Thread(bank,"李四");
		zhangsan.start();
		lisi.start();*/

	}

}
