package day18;
/**ʾ������Ǯ*/
/*class Bank implements Runnable{
	private int money = 0;//���
	//��Ǯ 
	public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"����100����"+money);
	}
	//this
	synchronized public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"����100����"+money);
	}
	public void run() {
		for(int i = 1; i <= 3 ;i++) {
			//ͬ�������
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
	private int money = 0;//���
	//��Ǯ 
	//this
	synchronized public void setMoney() {
		money += 100;
		System.out.println(Thread.currentThread().getName()+"����100����"+money);
	}
	public void run() {
		for(int i = 1; i <= 3 ;i++) {
				setMoney();
		}
	}
}
public class TestThread4 {
	public static void main(String[] args) {
		Bank t1 = new Bank("����");
		Bank t2 = new Bank("����");
		t1.start();
		t2.start();
		
/*		Bank bank = new Bank();
//		Bank bank1 = new Bank();
		Thread zhangsan = new Thread(bank,"����");
		Thread lisi = new Thread(bank,"����");
		zhangsan.start();
		lisi.start();*/

	}

}
