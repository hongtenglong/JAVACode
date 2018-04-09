package day09;

class Printer {
	private String concent;
	public Printer() {
	}
	public Printer(String concent) {
		this.concent = concent;
	}
	public String getConcent() {
		return concent;
	}
	public void setConcent(String concent) {
		this.concent = concent;
	}
	public void show() {
		System.out.println(concent);
	}
}

class BlackPrinter extends Printer{
	@Override
	public void show() {
		System.out.println("黑白"+ getConcent());
	}
}

class ColorPrinter extends Printer{
	@Override
	public void show() {
		System.out.println("彩色"+ getConcent());
	}
}

public class Demo1 {
	public static void main(String[] args) {
		BlackPrinter b = new BlackPrinter();
		b.setConcent("黑色打印机");
		b.show();
		
		ColorPrinter c = new ColorPrinter();
		c.setConcent("彩色打印机");
		c.show();
	}
}
