package day04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		do {
			System.out.println("*****菜单*****");
			System.out.println("1.输出正方形； 2.输出三角形；  3.输出圆形");
			System.out.println("请输入选择（1、2、3）：");
			i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("正方形");
				break;
			case 2:
				System.out.println("三角形");
				break;
			case 3:
				System.out.println("圆形");
				break;
			default:
				System.out.println("输入错误！");
			}
		}while(i!=1 && i!=2 && i!= 3); //while(!(i==1 || i==2 || i==3));
	}

}
