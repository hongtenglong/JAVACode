package day06.homeWork;

public class ZuoYe05 {
	public static void main(String[] args) {
		Draw d = new Draw();
		d.drawRec();
		d.drawTrian();
		d.drawPra();
	}
}

class Draw {
	int count = 0;
	int lines = 5;

	public int drawTrian() {
		int count = 0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
				count++;
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("星星总数为：" + count + "有" + lines + "行");
		return this.count = count;
	}
	public int drawRec() {
		int count = 0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= 10; j++) {
				count++;
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("星星总数为：" + count + "有" + lines + "行");
		return this.count = count;
	}
	
	public int drawPra() {
		int count = 0;
		for (int i = 0; i < lines; i++) {
			for (int j = 0; j <= i; j++) {
				
				System.out.print(" ");
			}
			for (int j = 0; j <= 10; j++) {
				count++;
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("星星总数为：" + count + "有" + lines + "行");
		return this.count = count;
	}

}