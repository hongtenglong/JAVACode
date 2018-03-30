package day04;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("\n");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
