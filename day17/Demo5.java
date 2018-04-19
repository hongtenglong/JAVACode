package day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("src/day17/demo1.java");
		byte[] b = new byte[fin.available()];
		//fin.read(b);
		fin.read(b,10,9);
		String str = new String(b,"gbk");
		System.out.println(str);
		fin.close();
	}

}
