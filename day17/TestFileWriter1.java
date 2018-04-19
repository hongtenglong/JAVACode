package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**练习：文件字符流*/
public class TestFileWriter1 {

	public static void main(String[] args) throws IOException {
		// 读取一个文件，逆序写入另一个文件中。
		//-------------读------------------
		//1
		FileReader fr = new FileReader("d:/data/a.txt");
		//2
		int temp;
		StringBuffer sf = new StringBuffer();
		while((temp = fr.read())!= -1) {
			sf.append((char)temp);//连接字符串
		}
		//3.
		fr.close();
		//-------------写----------------------
		//1
		FileWriter fw = new FileWriter("d:/data/b.txt");
		//2
		String s = sf.reverse().toString();//反转
		fw.write(s);
		//3.
		fw.close();
	}

}
