package day17.homeWork1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZuoYe1 {

	public static void main(String[] args) throws IOException {
		String str = "helloword";
		FileOutputStream fout = new FileOutputStream("src/day17/homeWork1/word.txt");
		fout.write(str.getBytes(),5,4);
		fout.flush();
		fout.close();

	}

}
