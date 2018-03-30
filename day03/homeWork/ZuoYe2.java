package day03.homeWork;

public class ZuoYe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1;i<=20;i++) {
			double d = 1 ;
			for(int j = 1; j<=i; j++) {
				d*=(1.0/j);
			}
			sum+=d;
		}
		System.out.println(sum);

	}

}
