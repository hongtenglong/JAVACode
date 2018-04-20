package day18;

class Bank5 implements Runnable{
	private int money = 0;

	public int getMoney() {
		return money;
	}

	synchronized public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"存了100，余额"+money);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			//同步代码块
			synchronized(this) {
				setMoney();
			}
			
		}
	}
	
}

public class Demo5 {
	public static void main(String[] args) {
		Bank5 b = new Bank5();
		Thread zhangsan = new Thread(b);
		Thread lisi = new Thread(b);
		zhangsan.start();
		lisi.start();
		
	}
}
