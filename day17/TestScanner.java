package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws FileNotFoundException {
		//   ��������                       ����Դ
/*		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
		if(input.hasNextInt()) {
			System.out.println("����");
		}else {
			System.out.println("��������,����");
		}
		input.close();*/
		// �Լ��Ĵ�������
	/*	FileInputStream fin = new FileInputStream("d:/data/Hello.java");
		Scanner input = new Scanner(fin);
		String name = input.nextLine();
		System.out.println(name);*/
		Scanner input = new Scanner("aa bb cc dd ee");
		String name = input.nextLine();
		System.out.println(name);
	}

}
