package day04;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo1 {

	public static void main(String[] args) {
		/**输出1-100之间的偶数*/
		System.out.println("输出1-100之间的偶数");
		for(int i = 1; i<=100 ; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		
		/**输出1-100之间能同时被2和3整除的数*/
		System.out.println("\n输出1-100之间能同时被2和3整除的数");
		for(int i = 1; i<=100 ; i++) {
			if(i%6==0)
				System.out.print(i+" ");
		}
		
		/**输出1-100之间能被3整除的数的个数*/
		//System.out.println("\n输出1-100之间能被3整除的数的个数");
		int num = 0;
		for(int i = 1; i<=100 ; i++) {
			if(i%3==0) {
				num++;
			}
		}
		System.out.println("1-100之间能被3整除的数的个数为："+num);
		
		/**输出100,95,90........5,0*/
		for(int i = 100; i>=0 ; i-=5) {
			System.out.print(i+",");
		}
		
		
		/**计算5！*/
		int sum = 1;
//		for(int i = 1;i<=5;i++) {
//			sum *=i;
//		}
//		System.out.println("\n5的阶乘等于："+sum);
		System.out.println();
		int i= 1;
		while(i<=5) {
			if(i!=5) {
			System.out.print(i+"×");
			}else {
			System.out.print(i);
			}
			sum*=i;
			i++;
		}
		System.out.println("="+sum);
		
	}

}
