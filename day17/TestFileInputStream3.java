package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**ʾ����try-catch��ʽ ����*/
public class TestFileInputStream3 {

	public static void main(String[] args) {
		// try-catch��ʽ
		File f = null;
		FileInputStream fin = null;
		
		try {
			//1
			f = new File("d:/data/a.txt");
			fin = new FileInputStream(f);
			//2
			byte [] b = new byte [fin.available()];
			fin.read(b);
			System.out.println(new String(b,"gbk"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fin != null) {
					fin.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			
		}
	}

}
