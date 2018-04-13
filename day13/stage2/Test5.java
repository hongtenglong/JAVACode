package day13.stage2;
abstract class Water{
	public abstract void water();
}
interface Filter{
	void filter();
}
interface Buffer{
	void buffer();
}
interface Heating{
	void heating();
}
interface Sugar{
	void sugar();
}
class Drinks1 extends Water implements Filter,Buffer{

	@Override
	public void buffer() {
		System.out.println("����");
	}

	@Override
	public void filter() {
		System.out.println("����");
	}

	@Override
	public void water() {
		buffer();
		filter();
		System.out.println("����1");
	}
	
}
class Drinks2 extends Water implements Buffer,Heating{

	@Override
	public void buffer() {
		System.out.println("����");
	}

	@Override
	public void heating() {
		System.out.println("����");
	}

	@Override
	public void water() {
		buffer();
		heating();
		System.out.println("����1");
	}	
}
class Drinks3 extends Water implements Filter,Sugar{

	
	@Override
	public void sugar() {
		System.out.println("����");
	}
	@Override
	public void filter() {
		System.out.println("����");
	}

	@Override
	public void water() {
		sugar();
		filter();
		System.out.println("����1");
	}
}
public class Test5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drinks1 d1 = new Drinks1();
		d1.water();
		
	}

}
