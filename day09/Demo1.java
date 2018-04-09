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
		System.out.println("�ڰ�"+ getConcent());
	}
}

class ColorPrinter extends Printer{
	@Override
	public void show() {
		System.out.println("��ɫ"+ getConcent());
	}
}

public class Demo1 {
	public static void main(String[] args) {
		BlackPrinter b = new BlackPrinter();
		b.setConcent("��ɫ��ӡ��");
		b.show();
		
		ColorPrinter c = new ColorPrinter();
		c.setConcent("��ɫ��ӡ��");
		c.show();
	}
}
