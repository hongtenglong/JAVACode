package day03.homeWork;

public class ZuoYe16 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < Math.abs(4 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (-2 * Math.abs(4 - i) + 9); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
