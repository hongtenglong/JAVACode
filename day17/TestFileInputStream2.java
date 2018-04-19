package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**示例：FileInputStream读取文件 read()*/
public class TestFileInputStream2 {

	public static void main(String[] args) throws IOException {
		// FileInputStream
		//1
		File f = new File("d:/data/a.txt");
		FileInputStream fin = new FileInputStream(f);
//		FileInputStream fin = new FileInputStream("d:/data/a.txt");
		//2
//		byte [] b = new byte[fin.available()];//文件内容的字节大小
		byte [] b = new byte[(int)f.length()];//文件内容的字节大小
		//把 读到的文件的内容的字节 存到 b这个数组中，返回值 读到的文件内容字节大小
//		fin.read(b);
		//（存储的数组，读到的数组的位置，个数）
		fin.read(b, 2, 3);
		String s = new String(b,"gbk");
		System.out.println(s);
		//3.
		fin.close();

	}

}
