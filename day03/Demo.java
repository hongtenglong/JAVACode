package day03;

import java.util.Scanner;

public class Demo {
	//深圳光环鼎盛科技发展有限公司
	//深圳光环交互科技发展有限公司

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年：");
		int year = sc.nextInt();
		System.out.print("请输入月：");
		int month = sc.nextInt();
		System.out.print("请输入日：");
		int day = sc.nextInt();
		int february = 28;
		int num = 0;
		for(int i = 0;i<month;i++) {
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				num+=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				num+=30;
				break;
			case 2:
				if((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
					num += 29;
				}else {
					num += 28;
				}
			}
		}
		System.out.println(year+" 年 "+month+" 月 "+day+" 号是今年的第"+(num+day)+"天");
	}

}
