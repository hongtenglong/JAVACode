package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**��ϰ���ļ��ַ���*/
public class TestFileWriter1 {

	public static void main(String[] args) throws IOException {
		// ��ȡһ���ļ�������д����һ���ļ��С�
		//-------------��------------------
		//1
		FileReader fr = new FileReader("d:/data/a.txt");
		//2
		int temp;
		StringBuffer sf = new StringBuffer();
		while((temp = fr.read())!= -1) {
			sf.append((char)temp);//�����ַ���
		}
		//3.
		fr.close();
		//-------------д----------------------
		//1
		FileWriter fw = new FileWriter("d:/data/b.txt");
		//2
		String s = sf.reverse().toString();//��ת
		fw.write(s);
		//3.
		fw.close();
	}

}
