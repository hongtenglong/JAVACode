package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo14 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day17/data/name.txt");
		FileReader fr = new FileReader(file);
		char [] b = new char[(int) file.length()];
		fr.read(b);
		String s = new String(b);
		StringBuffer sb = new StringBuffer(s);
		//System.out.print(sb.reverse());
		fr.close();
		
		FileWriter fw = new FileWriter("src/day17/data/name2.txt");
		fw.write(sb.reverse().toString());
		fw.close();
	}

}
