package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**��ϰ���ַ��� ģ���滻*/
public class TestFileWriterTemp {

	public static void main(String[] args) throws IOException {
		/*
		 * ��{name}��{type}��{master}�滻Ϊ����ĳ�����Ϣ
		 */
		//-----------��----------------------
	/*	//1
		FileReader fr = new FileReader("d:/data/temp.txt");
		BufferedReader bfr = new BufferedReader(fr);
		//2
		String s ;
		StringBuffer sf = new StringBuffer();
		while((s = bfr.readLine())!= null) {
			sf.append(s);
		}
		System.out.println(sf);
		//3
		bfr.close();*/
		//1
		FileReader fr = new FileReader("d:/data/temp.txt");
		
		//2
		StringBuffer sf = new StringBuffer();
		int temp;
		while((temp = fr.read())!= -1) {
			sf.append((char)temp);
		}
		//3
		fr.close();
		//------------д-----------------------
		
		//1
		FileWriter fw = new FileWriter("d:/data/temp.txt");
		//2
		String str = sf.toString();
		str = str.replace("{name}", "С��");
		str = str.replace("{type}", "Сè");
		str = str.replace("{master}","����");
		fw.write(str);
		//3.
		fw.close();
	}

}
