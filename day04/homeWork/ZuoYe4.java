package day04.homeWork;

public class ZuoYe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] b={{11},{21,22},{31,32,33}};
		int sum = 0;
		for(int i = 0;i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				sum+=b[i][j];
			}
		}
		System.out.println("ºÍÎª£º"+sum);
		
	}

}
