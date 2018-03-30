package day04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("0.00");
		double sum1 = 0 ;
		for(int i = 1; i<=21; i+=2) {
			System.out.print("1/"+i);
			if(i!=21)
				System.out.print(" + ");
			sum1+=(1.0/i);
		}
		System.out.println(" = "+f1.format(sum1));
		
		double sum2 = 0;
		int a = -1;
		for(int i = 1; i<=21; i+=2) {
			a*=-1;
			if(a>0 && i!=1) {
				System.out.print(" + ");
			}else if(a<0){
				System.out.print(" - ");
			}
			System.out.print("1/"+i);
			sum2+= (1.0/i)*a;
		}
		System.out.println(" = "+f1.format(sum2));
	}
}
