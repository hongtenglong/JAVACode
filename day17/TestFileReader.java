package day17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**ʾ����FileReader*/
public class TestFileReader {

	public static void main(String[] args) throws IOException {
		//---------��---------------------------------
		//1.
		FileReader fr = new FileReader("d:/data/a.txt");
		//2.
//		System.out.println(fr.read());//һ���ַ�
		int temp ;
		while((temp = fr.read())!= -1) {
			System.out.print((char)temp);
		}
		//3.
		fr.close();
		//-----------д-------------------------------
		//1.
		File f = new File("d:/data/b.txt");
		FileWriter fw = new FileWriter(f);
		//2.д
		String s = "hello";
		fw.write(s);
		//3.
		fw.close();
		
	}

}
