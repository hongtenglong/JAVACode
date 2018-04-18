package day16.trolley;

public class Goods {
	private int no;
	private String name;
	private double price;
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
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
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price;
	}
	
}
