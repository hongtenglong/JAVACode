package day03.homeWork;

public class ZuoYe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int i = 2;
		while(num!=i) {
			if(num%i==0) {
				break;
			}
			i++;
		}
		System.out.println(i==num?"素数":"不是素数");

	}

}
