package day17;

import java.io.*;

public class Demo8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("src/day17/data/ͼƬ1.jpg");
		FileInputStream fin = new FileInputStream(f1);
		BufferedInputStream bfin = new BufferedInputStream(fin);
		
		File f2 = new File("src/day17/data/ͼƬ2.jpg");
		FileOutputStream fout = new FileOutputStream(f2);
		BufferedOutputStream bfout = new BufferedOutputStream(fout);
		
		int temp;
		while((temp = bfin.read())!=-1) {
			bfout.write(temp);
		}
		bfout.flush();
		bfout.close();
		fout.close();
		bfin.close();
		fin.close();
	}

}
