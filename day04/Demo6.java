package day04;

public class Demo6 {

	public static void main(String[] args) {
		
		//�����һ����
		for(int i =1;i<=100;i++) {
			System.out.print(i+"\t");
			if(i%5==0) {
				System.out.println();
			}
		}
		
		
		//ˮ�ɻ�
		for(int i = 100;i<1000;i++) {
			int sum = (int) (Math.pow(i%10,3) +Math.pow(i/10%10,3)  + Math.pow(i/100,3));
			if(sum == i) {
				System.out.println(i);
			}
		}
		
	}

}
