package day04;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo1 {

	public static void main(String[] args) {
		/**���1-100֮���ż��*/
		System.out.println("���1-100֮���ż��");
		for(int i = 1; i<=100 ; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		
		/**���1-100֮����ͬʱ��2��3��������*/
		System.out.println("\n���1-100֮����ͬʱ��2��3��������");
		for(int i = 1; i<=100 ; i++) {
			if(i%6==0)
				System.out.print(i+" ");
		}
		
		/**���1-100֮���ܱ�3���������ĸ���*/
		//System.out.println("\n���1-100֮���ܱ�3���������ĸ���");
		int num = 0;
		for(int i = 1; i<=100 ; i++) {
			if(i%3==0) {
				num++;
			}
		}
		System.out.println("1-100֮���ܱ�3���������ĸ���Ϊ��"+num);
		
		/**���100,95,90........5,0*/
		for(int i = 100; i>=0 ; i-=5) {
			System.out.print(i+",");
		}
		
		
		/**����5��*/
		int sum = 1;
//		for(int i = 1;i<=5;i++) {
//			sum *=i;
//		}
//		System.out.println("\n5�Ľ׳˵��ڣ�"+sum);
		System.out.println();
		int i= 1;
		while(i<=5) {
			if(i!=5) {
			System.out.print(i+"��");
			}else {
			System.out.print(i);
			}
			sum*=i;
			i++;
		}
		System.out.println("="+sum);
		
	}

}
