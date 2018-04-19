package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("src/day17/a.txt",true);
		String s = "hellow ¹þ¹þ ";
		byte [] b = s.getBytes();
		fout.write(98);
		fout.close();
	}

}
