package day07;

import sun.applet.Main;

public class Demo2 {
	public static void main(String[] args) {
		Book b = new Book();
		b.setPageNum(100);
		b.setTitle("新华字典");
		System.out.println(b);
	}
}
class Book {
	String title;
	int pageNum;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		if (pageNum < 200) {
			System.out.println("页数不能低于200，默认为200");
			this.pageNum = 200;
		} else {
			this.pageNum = pageNum;
		}
	}

	public String toString() {
		return "名称：" + title + "\t页数: " + pageNum;
	}

}