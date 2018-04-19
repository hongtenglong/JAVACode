package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = null;
		FileInputStream fin = null;
		
		
		try {
			f = new File("src/day17/demo1.java");
			fin = new FileInputStream(f);
			byte [] b = new byte[fin.available()];
			fin.read(b);
			System.out.println(new String(b,"gbk"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fin !=null) {
					fin.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
