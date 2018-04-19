package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws FileNotFoundException {
		//   键盘输入                       数据源
/*		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
		if(input.hasNextInt()) {
			System.out.println("运算");
		}else {
			System.out.println("不是数字,处理");
		}
		input.close();*/
		// 自己的创建的流
	/*	FileInputStream fin = new FileInputStream("d:/data/Hello.java");
		Scanner input = new Scanner(fin);
		String name = input.nextLine();
		System.out.println(name);*/
		Scanner input = new Scanner("aa bb cc dd ee");
		String name = input.nextLine();
		System.out.println(name);
	}

}
