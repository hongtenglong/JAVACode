package day03.homeWork;

public class ZuoYe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		int i = 0;
		while(num>0) {
			if(num>3) {
				i=i+3;
				System.out.println("����"+i+"ƿ������1ƿ����ʣ"+(num-4));
			}else {
				i=i+num;
			}
			num -= 4;
			
		}
		System.out.println("�ܹ�����"+i);

	}

}
