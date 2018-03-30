package day03.homeWork;

public class ZuoYe17 {

	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < Math.abs(4 - i); j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 0; j < (-2 * Math.abs(4 - i) + 7); j++) {
				System.out.print(" ");
			}
			if (i != 0 && i != 8) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
