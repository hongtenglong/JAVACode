package day17.homeWork1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ZuoYe2 {

	public static void main(String[] args) throws IOException {
		//�����ļ�̫���ҾͲ��������
		FileInputStream fin = new FileInputStream("src/day17/homeWork1/��˿Ҳ�д���.mp3");
		BufferedInputStream bin = new BufferedInputStream(fin);
		FileOutputStream fout = new FileOutputStream("src/day17/homeWork1/��˿Ҳ�д���2.mp3");
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
