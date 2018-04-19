package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("src/day17/Demo.java");
		Scanner sc = new Scanner(fin);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
	}

}
