package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		//读 src/day17/demo1.java 文件的内容  存到内存中
		//File f = new File("src/day17/demo1.java");
		//FileInputStream fin = new FileInputStream(f);
		//创建流对象
		FileInputStream fin = new FileInputStream("src/day17/demo1.java");
		InputStreamReader isr = new InputStreamReader(fin);
		//读取文件的内容
		/*int temp;
		while((temp=fin.read())!=-1) {
			System.out.print((char)temp);
		}*/
		//处理中文乱码
		int temp;
		while((temp=isr.read())!=-1) {
			System.out.print((char)temp);
		}
		
	}
}
