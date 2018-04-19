package day17.homeWork2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZuoYe3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("输入要写入文件的字符串：");
		pw.flush();
		pw.close();
		String name = sc.nextLine();
		FileWriter fw = new FileWriter("src/day17/homeWork2/Hello.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(name);
		bw.flush();
		bw.close();
	}

}
