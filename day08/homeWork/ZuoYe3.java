package day08.homeWork;

class Student1{
	int capacity = 0;

	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void jieShui() {
		YinShuiJi.setRongJi(YinShuiJi.getRongJi()-(100-capacity));
		setCapacity(100);
	}
	public void heShui() {
		capacity-=10;
	}
	
	public void show() {
		System.out.println("饮水机剩余水量："+YinShuiJi.getRongJi());
		System.out.println("自己杯中剩余水量:"+capacity);
	}
}

class YinShuiJi{
	static int rongJi = 1000;
	public static int getRongJi() {
		return rongJi;
	}
	public static void setRongJi(int rongJi) {
		YinShuiJi.rongJi = rongJi;
	}
	
}



public class ZuoYe3 {

	public static void main(String[] args) {
		Student1 a = new Student1();
		a.jieShui();
		a.heShui();
		a.heShui();
		a.show();
		Student1 b = new Student1();
		b.jieShui();
		b.setCapacity(0);
		b.jieShui();
		b.show();
		Student1 c = new Student1();
		c.jieShui();
		c.heShui();
		c.heShui();
		c.heShui();
		c.heShui();
		c.heShui();
		c.heShui();
		c.heShui();
		c.show();
		
	}

}
