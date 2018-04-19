package day17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**Ê¾Àý£ºFileReader*/
public class TestFileReader {

	public static void main(String[] args) throws IOException {
		//---------¶Á---------------------------------
		//1.
		FileReader fr = new FileReader("d:/data/a.txt");
		//2.
//		System.out.println(fr.read());//Ò»¸ö×Ö·û
		int temp ;
		while((temp = fr.read())!= -1) {
			System.out.print((char)temp);
		}
		//3.
		fr.close();
		//-----------Ð´-------------------------------
		//1.
		File f = new File("d:/data/b.txt");
		FileWriter fw = new FileWriter(f);
		//2.Ð´
		String s = "hello";
		fw.write(s);
		//3.
		fw.close();
		
	}

}
