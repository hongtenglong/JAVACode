package day16.operator;
/**…Ã∆∑*/
public class Goods {
	private int no;
	private String name;
	private double price;
	private int count;
	public Goods() { 
	}
	public Goods(int no, String name, double price, int count) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return no+"\t"+name+"\t"+price+"\t"+count;
	}
	
	
}
