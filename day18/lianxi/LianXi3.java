package day18.lianxi;

import java.util.InputMismatchException;
import java.util.Scanner;

class Tool3{
	public void connect(String s1,String s2) {
		System.out.println(s1 + s2);
	}
	public void connect(int i1,int i2) {
		System.out.println(i1 + i2);
	}
	public void connect(double d1,double d2) {
		System.out.println(d1 + d2);
	}
}

public class LianXi3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ���ַ�����");
		String s1 = sc.next();
		System.out.print("������ڶ����ַ�����");
		String s2 = sc.next();
		
		try {
			System.out.print("�������һ��������");
			int i1 = sc.nextInt();
			System.out.print("������ڶ���������");
			int i2 = sc.nextInt();
			System.out.print("�������һ����������");
			double d1 = sc.nextDouble();
			System.out.print("������ڶ�����������");
			double d2 = sc.nextDouble();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ͳ�ƥ��");
		}

	}

}
