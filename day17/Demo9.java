package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Demo9 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("������ѧԱ������");
		File f = new File("src/day17/data/name.txt");
		FileOutputStream fout = new FileOutputStream(f,true);
		while(!(name = sc.next()).equals("q")) {
			fout.write(name.getBytes());
			fout.write("\r\n".getBytes());
			System.out.print("������ѧԱ������");
		}
		sc.close();
		fout.close();
	}

}
