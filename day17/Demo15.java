package day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo15 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day17/data/name.txt");
		FileReader fr = new FileReader(file);
		BufferedReader bfr = new BufferedReader(fr);
		String s;
		while((s = bfr.readLine())!=null) {
			System.out.println(s);
		}
		fr.close();
		bfr.close();
	}

}
