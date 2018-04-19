package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Demo13 {

	public static void main(String[] args) throws IOException {
		// 把一个文件的内容读取出来，在控制台上打印输出；
		//读
		FileInputStream fin = new FileInputStream("src/day17/data/name.txt");
		byte [] b = new byte[fin.available()];
		fin.read(b);
		fin.close();
		PrintStream print = new PrintStream(System.out);
		print.print(new String(b,"gbk"));
		print.close();
	}

}
