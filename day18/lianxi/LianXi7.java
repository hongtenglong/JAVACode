package day18.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LianXi7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("src/day18/lianxi/Dest.txt");
		byte[] c = "100,101,102,103,104,105".getBytes();
		fos.write(c);
		fos.close();

		FileInputStream fis = new FileInputStream("src/day18/lianxi/Dest.txt");
		byte[] c2 = new byte[fis.available()];
		for (int i = c2.length - 1; i >= 0; i--) {
			c2[i] = (byte) fis.read();
		}
		for (byte b : c2) {
			System.out.print(((char)b));
		}
	}

}
