package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

/**Ê¾Àý£º»º³å×Ö·ûÁ÷*/
public class TestBufferedReader {

	public static void main(String[] args) throws IOException {
		//---------¶Á---------------------------------
		//1.
		FileReader fr = new FileReader("d:/data/a.txt");
		BufferedReader bfr = new BufferedReader(fr);
		//2.
	/*	int temp ;
		while((temp = fr.read())!= -1) {
			System.out.print((char)temp);
		}*/
		String s;
		while((s = bfr.readLine())!= null) {
			System.out.println(s);
		}
	
		//3.
		bfr.close();

	}

}
