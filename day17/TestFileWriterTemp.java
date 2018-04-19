package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**练习：字符流 模板替换*/
public class TestFileWriterTemp {

	public static void main(String[] args) throws IOException {
		/*
		 * 把{name}、{type}、{master}替换为具体的宠物信息
		 */
		//-----------读----------------------
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
		//------------写-----------------------
		
		//1
		FileWriter fw = new FileWriter("d:/data/temp.txt");
		//2
		String str = sf.toString();
		str = str.replace("{name}", "小花");
		str = str.replace("{type}", "小猫");
		str = str.replace("{master}","郭靖");
		fw.write(str);
		//3.
		fw.close();
	}

}
