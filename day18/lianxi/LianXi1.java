package day18.lianxi;

class Math1{
	double sum =0;
	public void sum(int n) {
		if(n%2==0) {
			for(int i = 2; i <=n;i++) {
				sum += 1.0/i;
				i+=2;
			}
		}else {
			for(int i = 1; i <=n;i++) {
				sum += 1.0/i;
				i+=2;
			}
		}
		System.out.println(sum);
	}
}

public class LianXi1 {

	public static void main(String[] args) {
		Math1 m = new Math1();
		m.sum(15);

	}

}
