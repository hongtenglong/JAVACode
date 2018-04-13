package day13.stage2;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 彩票
				Scanner input = new Scanner(System.in);
				int [] num = new int[7];
				int r;
				int j ;
				int i = 0;
				int count = 0;
				for(;;) {
					r = (int)(Math.random()*(30-1+1)+1);
					for(j = 0; j < num.length; j++) {
						if(num[j] == r) {
							break;
						}
					}
					if( j == num.length) {
						num[i++] = r;
						count ++;
					}
					if(count == 7) {
						break;
					}
				}
				System.out.println(Arrays.toString(num));
		/*		System.out.println("请输入7个数字：");
				int [] inputnum = new int[7];
				for(int k = 0; k< inputnum.length; k++) {
					inputnum[k] = input.nextInt();
				}
				int countnew = 0;

				for(int m = 0; m< inputnum.length; m++) {
					for(int n = 0;n < inputnum.length; n++ ) {
						if(inputnum[m] == num[n]) {
							countnew ++;
							break;
						}
					}
				}

				
				System.out.println("中了几个数字："+countnew);*/	
	}

}
