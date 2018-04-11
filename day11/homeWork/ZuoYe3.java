package day11.homeWork;
interface Commond{
	int process(int [] target);
}

class ProcessArray{
	public int process(int[] target,Commond commond) {
		return commond.process(target);
	}
}

public class ZuoYe3 {
	public static void main(String[] args) {
		int [] target ={1,2,3,4,5,6,7};
		ProcessArray p = new ProcessArray();
		Commond c1 = new Commond() {
			@Override
			public int process(int[] target) {
				int sum = 0;
				for (int i : target) {
					sum+=i;
				}
				return sum;
			}
		};
		Commond c2 = (a)->{int sum=0;for (int i : a) {sum+=i;}return sum;};
		
		int sum1 = p.process(target, c1);
		int sum2 = p.process(target, c2);
		System.out.println("和1为："+sum1);
		System.out.println("和2为："+sum2);
	}
}
