package day17.homeWork1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZuoYe2 {

	public static void main(String[] args) throws IOException {
		//音乐文件太大，我就不存进来了
		FileInputStream fin = new FileInputStream("src/day17/homeWork1/屌丝也有春天.mp3");
		BufferedInputStream bin = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream("src/day17/homeWork1/屌丝也有春天2.mp3");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		int temp;
		while((temp=bin.read())!=-1) {
			bout.write(temp);
		}
		bout.flush();
		bout.close();
		fout.close();
		bin.close();
		fin.close();
	}

}
