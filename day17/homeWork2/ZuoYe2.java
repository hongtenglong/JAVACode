package day17.homeWork2;

import java.io.FileWriter;
import java.io.IOException;

public class ZuoYe2 {

	public static void main(String[] args) throws IOException {
		char [] a = "ºÃºÃÑ§Ï°Java".toCharArray();
		FileWriter fw = new FileWriter("src/day17/homeWork2/haha.txt");
		fw.write(a, 0, a.length);
		fw.flush();
		fw.close();
	}

}
