package day04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i ;
		do {
			System.out.println("*****�˵�*****");
			System.out.println("1.��������Σ� 2.��������Σ�  3.���Բ��");
			System.out.println("������ѡ��1��2��3����");
			i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("������");
				break;
			case 2:
				System.out.println("������");
				break;
			case 3:
				System.out.println("Բ��");
				break;
			default:
				System.out.println("�������");
			}
		}while(i!=1 && i!=2 && i!= 3); //while(!(i==1 || i==2 || i==3));
	}

}
