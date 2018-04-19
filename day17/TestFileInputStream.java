package day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**示例：FileInputStream*/
public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		// 读d:/data/a.txt文件中的内容 ，存到 内存中
//		File f = new File("d:/data/a.txt");
//		FileInputStream fin = new FileInputStream(f);
		//1.创建流对象
		FileInputStream fin = new FileInputStream("d:/data/a.txt");
		//转换 字符流  ：把 字节流 转换 成字符流(包装流)
		InputStreamReader ir = new InputStreamReader(fin);
		//2.读取文件的内容
	/*	int temp = fin.read();
		System.out.println((char)temp);//
		System.out.println((char)fin.read());
		System.out.println((char)fin.read());
		System.out.println(fin.read());//读到文件 末尾 是 -1
*/		
		//字节流 读取
/*		int temp;
		while((temp = fin.read()) != -1) {
			System.out.print((char)temp);
		}*/
		int temp;
		while((temp = ir.read()) != -1) {
			System.out.print((char)temp);
		}
		//3.关闭流
//		fin.close();
//		ir.close();
		ir.close();
		
	}

}
